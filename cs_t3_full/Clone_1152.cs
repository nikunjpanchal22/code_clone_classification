public static void Swap < T > (ref T obj, Func < T, T > cloner, Action < T > op) where T : class {
    while (true) {
        var objBefore = Volatile.Read (ref obj);
        var newObj = cloner (objBefore);
        op (newObj);
        if (Interlocked.CompareExchange (ref obj, newObj, objBefore) == objBefore)
            return;
    }
}


  public static void Swap<T>(ref T obj, Func<T,T> cloner = null, Action<T> op = null) where T : class
{
    while (true)
    {
        var storedObj = Volatile.Read(ref obj);
        var newObject = cloner(storedObj);
        if (op != null) op(newObject);
        var success = Interlocked.CompareExchange(ref obj, newObject, storedObj) == storedObj;
        if (success) return;
    }
}



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
    bool done = false;
    while (!done)
    {
        var current = Volatile.Read(ref obj);
        T result = cloner(current);
        if (op != null)
            op(result); 
        done = Interlocked.CompareExchange(ref obj, result, current) == current;
    }
}



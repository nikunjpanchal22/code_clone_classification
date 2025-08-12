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
    bool isSwapped = false;
    while (!isSwapped) 
    {
        T previousObj = Volatile.Read(ref obj);
        T newObj = cloner(previousObj);
        if (op != null)
            op(newObj);
        isSwapped = Interlocked.CompareExchange(ref obj, newObj, previousObj) == previousObj;
    }
}



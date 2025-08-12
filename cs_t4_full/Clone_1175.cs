public static void Swap < T > (ref T obj, Func < T, T > cloner, Action < T > op) where T : class {
    while (true) {
        var objBefore = Volatile.Read (ref obj);
        var newObj = cloner (objBefore);
        op (newObj);
        if (Interlocked.CompareExchange (ref obj, newObj, objBefore) == objBefore)
            return;
    }
}


 public static void Swap<T>(ref T obj, Func<T,T> cloner = null, Action<T> op = null) where T: class
{
    bool swapped = false;
    while (!swapped)
    {
        T before = Volatile.Read(ref obj);
        T newObject = cloner(before);
        if (op != null)
        {
            op(newObject);
        }
        if (Interlocked.CompareExchange(ref obj, newObject, before) == before)
        {
            swapped = true;
        }
    }
}



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
    bool swapped = false;
    while (!swapped)
    {
        var item = Volatile.Read(ref obj);
        T newItem = cloner(item);
        if (op != null)
        {
            op(newItem);
        }
        swapped = Interlocked.CompareExchange(ref obj, newItem, item) == item;
    }
}



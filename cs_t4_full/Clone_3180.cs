public static void Swap < T > (ref T obj, Func < T, T > cloner, Action < T > op) where T : class {
    while (true) {
        var objBefore = Volatile.Read (ref obj);
        var newObj = cloner (objBefore);
        op (newObj);
        if (Interlocked.CompareExchange (ref obj, newObj, objBefore) == objBefore)
            return;
    }
}



public static void SwapV2 < T > (ref T obj, Func < T, T > cloner, Action < T > op) where T : class {
    T obj1;
    do {
        obj1 = obj;
        var newObj = cloner (obj1);
        op (newObj);
    } while (Interlocked.CompareExchange (ref obj, newObj, obj1) != obj1);
}



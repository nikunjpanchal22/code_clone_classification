public static void Swap < T > (ref T obj, Func < T, T > cloner, Action < T > op) where T : class {
    while (true) {
        var objBefore = Volatile.Read (ref obj);
        var newObj = cloner (objBefore);
        op (newObj);
        if (Interlocked.CompareExchange (ref obj, newObj, objBefore) == objBefore)
            return;
    }
}


 

public static void SwapV3 < T > (ref T obj, Func < T, T > cloner, Action < T > op) where T : class {
    T obj2;
    while (true) {
        obj2 = Volatile.Read (ref obj);
        var clonedObj = cloner (obj2);
        op (clonedObj);
        if (Interlocked.CompareExchange (ref obj, clonedObj, obj2) == obj2) break;
    }
}



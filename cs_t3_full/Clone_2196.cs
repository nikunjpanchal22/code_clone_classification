public static void Swap < T > (ref T obj, Func < T, T > cloner, Action < T > op) where T : class {
    while (true) {
        var objBefore = Volatile.Read (ref obj);
        var newObj = cloner (objBefore);
        op (newObj);
        if (Interlocked.CompareExchange (ref obj, newObj, objBefore) == objBefore)
            return;
    }
}


 

public static void SwapV5 < T > (ref T obj, Func < T, T > cloner, Action < T > op) where T : class {
    T obj4;
    while (true) {
        obj4 = Volatile.Read (ref obj);
        var renewedObj = cloner (obj4);
        op (renewedObj);
        if (Interlocked.CompareExchange (ref obj, renewedObj, obj4) == obj4)
            break;
    }
}



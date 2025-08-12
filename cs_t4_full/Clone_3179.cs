public static void Swap < T > (ref T obj, Func < T, T > cloner, Action < T > op) where T : class {
    while (true) {
        var objBefore = Volatile.Read (ref obj);
        var newObj = cloner (objBefore);
        op (newObj);
        if (Interlocked.CompareExchange (ref obj, newObj, objBefore) == objBefore)
            return;
    }
}


 

public static void SwapV11 < T > (ref T obj, Func < T, T > cloner, Action < T > op) where T : class {
    T tmp;
    do {
        tmp = obj;
        var newTmp = cloner (tmp);
        op (newTmp);
    } while (Interlocked.CompareExchange (ref obj, newTmp, tmp) != tmp);
}



public static void Swap < T > (ref T obj, Func < T, T > cloner, Action < T > op) where T : class {
    while (true) {
        var objBefore = Volatile.Read (ref obj);
        var newObj = cloner (objBefore);
        op (newObj);
        if (Interlocked.CompareExchange (ref obj, newObj, objBefore) == objBefore)
            return;
    }
}


 

public static void SwapV7 < T > (ref T obj, Func < T, T > cloner, Action < T > op) where T : class {
    T priorObj;
    do {
        priorObj = Volatile.Read (ref obj);
        var newObj = cloner (priorObj);
        op (newObj);
    } while (Interlocked.CompareExchange (ref obj, newObj, priorObj) != priorObj);
}



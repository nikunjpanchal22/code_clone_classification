public static void Swap < T > (ref T obj, Func < T, T > cloner, Action < T > op) where T : class {
    while (true) {
        var objBefore = Volatile.Read (ref obj);
        var newObj = cloner (objBefore);
        op (newObj);
        if (Interlocked.CompareExchange (ref obj, newObj, objBefore) == objBefore)
            return;
    }
}


 

public static void SwapV9 < T > (ref T obj, Func < T, T > cloner, Action < T > op) where T : class {
    T obj5;
    while (!Object.ReferenceEquals((obj5 = Volatile.Read(ref obj)), Interlocked.CompareExchange(ref obj, cloner(obj5 = cloner (obj5)), obj5)))
        op(obj5);
}



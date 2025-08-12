public static void Swap < T > (ref T obj, Func < T, T > cloner, Action < T > op) where T : class {
    while (true) {
        var objBefore = Volatile.Read (ref obj);
        var newObj = cloner (objBefore);
        op (newObj);
        if (Interlocked.CompareExchange (ref obj, newObj, objBefore) == objBefore)
            return;
    }
}


 

public static void SwapV4 < T > (ref T obj, Func < T, T > cloner, Action < T > op) where T : class {
    do {
        var obj3 = Volatile.Read (ref obj);
        var clonedObj = cloner (obj3);
        op (clonedObj);
    } while (!object.Equals(Interlocked.CompareExchange (ref obj, clonedObj, obj3), obj3));
}



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
    try
    {
        var objBefore = Volatile.Read(ref obj);
        var newObj = cloner(objBefore);
        op?.Invoke(newObj);
        if (Interlocked.CompareExchange(ref obj, newObj, objBefore) == objBefore)
            return;
    }
    catch (Exception e)
    {
        Console.WriteLine(e.Message);
    }
}



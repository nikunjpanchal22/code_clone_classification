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
    bool flag = true;
    while (flag)
    {
        T readObject = obj;
        T newObject = cloner(obj);
        if (op != null)
        {
           op(newObject); 
        }
        if (Interlocked.CompareExchange(ref obj, newObject, readObject) == readObject) {
            flag = false;
        } 
    } 

}



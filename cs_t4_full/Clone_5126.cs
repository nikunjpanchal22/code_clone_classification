public void MethodA () {
    lock (key)
    {
        while (lockedType != this.GetType ()) {
            if (lockedType == null) {
                lockedType = this.GetType ();
                signal.Set ();
            } else if (lockedType != this.GetType ()) {
                signal.WaitOne ();
            }
        }
        Interlocked.Increment (ref threadsInMethodA);
    } semaphore.WaitOne ();
    try {
        MethodAImplementation ();
    }
    finally {
        lock (key)
        {
            semaphore.Release ();
            int threads = Interlocked.Decrement (ref threadsInMethodA);
            if (threads == 0) {
                lockedType = null;
                signal.Reset ();
            }
        }}
}


 public void MethodA () {
    bool lockTypeNull;
    lock (key)
    {
        lockTypeNull = lockedType == null;
        if (lockTypeNull)
        {
            lockedType = this.GetType();
            signal.WaitOne();
            MethodAImplementation();
            semaphore.Release();
        } 
        else 
        {
            Interlocked.Increment(ref threadsInMethodA);
            semaphore.WaitOne();
            MethodAImplementation();
            semaphore.Release();
        }
    } 
}



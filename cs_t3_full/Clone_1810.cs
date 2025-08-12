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


  public void MethodA () 
    { 
        SpinLock sLock = new SpinLock (false); 
        bool lockTaken = false; 

        try 
        { 
            sLock.Enter (ref lockTaken); 

            while (lockedType != this.GetType ()) 
            { 
                if (lockedType == null) 
                { 
                    lockedType = this.GetType (); 
                    signal.Set (); 
                } 
                else if (lockedType != this.GetType ()) 
                { 
                    signal.WaitOne (); 
                } 
            } 
            Interlocked.Increment (ref threadsInMethodA); 
        } 
        finally 
        { 
            if (lockTaken) 
            { 
                sLock.Exit (); 
            } 
        } 
        semaphore.WaitOne (); 

        try 
        { 
            MethodAImplementation (); 
        } 
        finally 
        { 
            Monitor.Enter (key); 
            semaphore.Release (); 
            int threads = Interlocked.Decrement (ref threadsInMethodA); 
            if (threads == 0) 
            { 
                lockedType = null; 
                signal.Reset (); 
            } 
            Monitor.Exit (key); 
        } 
} 



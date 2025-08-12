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
        EventWaitHandle ewh = new EventWaitHandle (false, EventResetMode.AutoReset); 

        lock (key) 
        { 
            while (lockedType != this.GetType ()) 
            { 
                if (lockedType == null) 
                { 
                    lockedType = this.GetType (); 
                    ewh.Set (); 
                } 
                else if (lockedType != this.GetType ()) 
                { 
                    ewh.WaitOne (); 
                } 
            } 
            Interlocked.Increment (ref threadsInMethodA); 
        } 
        semaphore.WaitOne (); 

        try 
        { 
            MethodAImplementation (); 
        } 
        finally 
        { 
            lock (key) 
            { 
                semaphore.Release (); 
                int threads = Interlocked.Decrement (ref threadsInMethodA); 
                if (threads == 0) 
                { 
                    lockedType = null; 
                    ewh.Reset (); 
                } 
            } 
        } 
}

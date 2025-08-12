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




public void MethodA()
{
	    lock (key)
	    {
		while (!this.GetType().Equals(lockedType))
		{
		    if (null == lockedType)
		    {
		        lockedType = GetType();
		        signal.Set();
		    }
		    else if (!this.GetType().Equals(lockedType))
		    {
		        signal.WaitOne();
		    }
		}
		Interlocked.Increment(ref threadsInMethodA);
	    }

	    semaphore.WaitOne();

	    try 
	    {
		MethodAImplementation();
	    } 
	    finally
	    {
		lock (key)
		{
		    semaphore.Release();

		    if (Interlocked.Decrement(ref threadsInMethodA) == 0)
		    {
		        lockedType = null;
		        signal.Reset();
		    }
		}
	    }
}



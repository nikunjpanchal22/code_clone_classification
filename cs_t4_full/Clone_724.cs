public Boolean TryGetValue (TKey key, out TValue value) {
    internalLock.AcquireReaderLock (Timeout.Infine);
    try {
        return dictionary.TryGetValue (key, out value);
    }
    finally {
        internalLock.ReleaseReaderLock ();
    }
}


 public Boolean TryGetValue (TKey key, out TValue value) {
    bool lockTaken = false;
    try
    {
        Monitor.TryEnter(internalLock, ref lockTaken);
        if (lockTaken)
            return dictionary.TryGetValue (key, out value);
        else 
            return false;
    }
    finally
    {
        if (lockTaken) Monitor.Exit(internalLock);
    }
}



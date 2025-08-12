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
    bool isLocked = false;
    try
    {
        isLocked = Semaphore.WaitOne();
        if (isLocked)
            return dictionary.TryGetValue (key, out value);
        else 
            return false;
    }
    finally
    {
        if (isLocked) Semaphore.Release();
    }
}



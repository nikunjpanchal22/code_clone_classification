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
    if(Mutex.WaitOne(internalLock))
    {
        try {
            return dictionary.TryGetValue (key, out value);
        }
        finally {
            Mutex.ReleaseMutex(internalLock);
        }
    }
    else
    {
        return false;
    }
}



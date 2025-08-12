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
    if(SpinLock.TryEnter(internalLock))
    {
        try {
            return dictionary.TryGetValue (key, out value);
        }
        finally {
            SpinLock.Exit(internalLock);
        }
    }
    else
    {
        return false;
    }
}



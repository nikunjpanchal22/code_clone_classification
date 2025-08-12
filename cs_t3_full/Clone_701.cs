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
    if(internalLock.TryAcquireReaderLock (Timeout.Infine))
    {
        try {
            return dictionary.TryGetValue (key, out value);
        }
        finally {
            internalLock.ReleaseReaderLock ();
        }
    }
    else
    {
        return false;
    }
}



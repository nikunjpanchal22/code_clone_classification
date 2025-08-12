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
    lock (internalLock) {
        return dictionary.TryGetValue (key, out value);
    }
}



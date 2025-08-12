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
    Monitor.Enter(internalLock);
    try {
        return dictionary.TryGetValue (key, out value);
    }
    finally {
        Monitor.Exit(internalLock);
    }
}



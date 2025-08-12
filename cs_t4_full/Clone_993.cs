public Message WrapA (int a, int millisecondsTimeout) {
    Message returnMessage = null;
    bool lockTaken = false;
    Monitor.TryEnter (gate, 100, ref lockTaken);
    if (lockTaken) {
        returnMessage = new Message (a, pendingB);
        pendingB = null;
        Monitor.Pulse (gate);
        Monitor.Exit (gate);
    } else {
        returnMessage = new Message (a, null);
    }
    return returnMessage;
}


 public Message WrapA (int a, int millisecondsTimeout) {  
    ReaderWriterLockSlim rwls = new ReaderWriterLockSlim(LockRecursionPolicy.NoRecursion);
    Message returnMessage = null;

    if (!rwls.TryEnterWriteLock (millisecondsTimeout)) 
    { 
        returnMessage = new Message (a, null); 
    } 
    else 
    { 
        returnMessage = new Message (a, pendingB); 
        pendingB = null; 
        Monitor.Pulse (gate); 
        rwls.ExitWriteLock (); 
    } 
    return returnMessage;
}



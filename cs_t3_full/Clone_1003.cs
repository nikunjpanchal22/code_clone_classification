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
    bool lockTaken = false;
    SemaphoreSlim semaphore = new SemaphoreSlim(1, 1);
    Message returnMessage = null;
    if (semaphore.Wait(millisecondsTimeout)) {
        returnMessage = new Message (a, pendingB);
        pendingB = null;
    }
    else
    {
        returnMessage = new Message (a, null);
    }
    semaphore.Release();
    return returnMessage;
}



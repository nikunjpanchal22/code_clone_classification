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
    AutoResetEvent waitHandle = new AutoResetEvent(false);
    Message returnMessage = null;
    
    if ( waitHandle.WaitOne(millisecondsTimeout, false) ) {
        returnMessage = new Message (a, pendingB);
        pendingB = null;
    } 
    else 
    {
        returnMessage = new Message (a, null);
    }
    return returnMessage;
}



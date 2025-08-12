public Message WrapB (int b, int millisecondsTimeout) {
    Message returnMessage = null;
    bool lockTaken = false;
    Monitor.TryEnter (gate, 100, ref lockTaken);
    if (lockTaken) {
        if (pendingB != null) {
            Monitor.Wait (gate, 100);
        }
        if (pendingB != null) {
            returnMessage = new Message (null, b);
        } else {
            pendingB = b;
            if (! Monitor.Wait (gate, millisecondsTimeout)) {
                pendingB = null;
                Monitor.Pulse (gate);
                returnMessage = new Message (null, b);
            }
        }
        Monitor.Exit (gate);
    } else {
        returnMessage = new Message (null, b);
    }
    return returnMessage;
}



public Message WrapB(int b, int millisecondsTimeout)
{
    Message returnMessage = null; 
    lock (gate)
    {
        if (pendingB != null) 
            Monitor.Wait(gate);
          
        if (pendingB != null)
            returnMessage = new Message(null, b);
        else
        {
            pendingB = b;
            if (!Monitor.Wait(gate, millisecondsTimeout))
            {
                pendingB = null;
                returnMessage = new Message(null, b);
            }
        }
    } 
    return returnMessage;
}



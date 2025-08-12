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
    CountdownEvent cde = new CountdownEvent(1);   
    Message returnMessage = null;

     System.Threading.ThreadPool.RegisterWaitForSingleObject (cde.WaitHandle, 
     delegate
     {
         lockTaken = true;
         cde.Signal();
     }, null, millisecondsTimeout, false);  

    if (lockTaken) 
    {
        returnMessage = new Message (a, pendingB);
        pendingB = null;
        Monitor.Pulse (gate);
    } 
    else 
    {
        returnMessage = new Message (a, null);
    }
    return returnMessage;
}



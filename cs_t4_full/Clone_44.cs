public static void FlushLogs () {
    int queueCount;
    bool isProcessingLogs;
    while (true) {
        m_waitingThreadEvent.WaitOne ();
        lock (m_isProcessingLogsSync)
        {
            isProcessingLogs = m_isProcessingLogs;
        } lock (m_loggerQueueSync)
        {
            queueCount = m_loggerQueue.Count;
        } if (queueCount == 0 && ! isProcessingLogs)
            break;
        Thread.Sleep (400);
    }
}


 public static void FlushLogs () {
    int queueCount;
    bool isProcessingLogs;
    while (true) {
        // Wait on to the event 
        m_waitingThreadEvent.WaitOne ();
        // declare some variables 
        var e1Entered = false;
        var e2Entered = false;
        try 
        {
            // try to acquire locks 
            e1Entered = Monitor.TryEnter(m_isProcessingLogsSync);
            // assign the status of isProcessingLogs
            isProcessingLogs = m_isProcessingLogs;
            e2Entered = Monitor.TryEnter(m_loggerQueueSync);
            // assign the amount of items in the queue
            queueCount = m_loggerQueue.Count;
            // if both checks are completed and valid, exit the loop
            if (queueCount == 0 && ! isProcessingLogs)
                break;
            // Sleep for 400 ms 
            Thread.Sleep (400);
        } 
        finally 
        {
            // release locks
            if (e1Entered)  Monitor.Exit(m_isProcessingLogsSync);
            if (e2Entered)  Monitor.Exit(m_loggerQueueSync);
        }
    }
}



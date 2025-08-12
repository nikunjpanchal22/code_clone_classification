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
    
    while(true) {
        m_waitingThreadEvent.WaitOne ();
        // check if Logs in the Queue
        if (m_loggerQueue.Count == 0) {
            // if the Queue is Empty check to see if it is Processing
            lock (m_isProcessingLogsSync){
                // if it is processing we will wait
                if (m_isProcessingLogs) {
                    Thread.Sleep(400);
                    // if it's not processing and Queue is empty -- break
                } else { break;
                }
            }
        // if there is something in the queue -- keep in loop 
        } else {
            // wait 400ms 
            Thread.Sleep(400);
        }
    }
}



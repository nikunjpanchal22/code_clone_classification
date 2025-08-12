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
    
    bool isProcessingLogs;
    // check for Queue 
    if (!m_loggerQueue.Any()) {
        // If it's empty check processing status
        lock (m_isProcessingLogsSync){
            isProcessingLogs = m_isProcessingLogs;
            // wait until process is done
            while(isProcessingLogs){
                m_waitingThreadEvent.WaitOne ();
            }
        // break
        break;
        }
    }
    else{
        // wait 400ms and loop
        Thread.Sleep(400);
    }
    
}



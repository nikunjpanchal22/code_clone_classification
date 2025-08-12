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


 public static void FlushLogs()
{
    while (true)
    {
        m_waitingThreadEvent.WaitOne();
        lock(m_isProcessingLogsSync)
        {
            if (!m_isProcessingLogs && m_loggerQueue.Count == 0)
            {
                break;
            }
            Thread.Sleep(400);
        }
    }
}



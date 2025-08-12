private EventHandlerFunction popEvent () {
    EventHandlerFunction ret = null;
    lock (eventQueueLock)
    {
        int b = (queueOutIndex + 1) & 255;
        if (queueOutIndex == queueInIndex) {
            mainLoopWaitHandle.Reset ();
            return null;
        }
        ret = eventQueue [queueOutIndex];
        eventQueue [queueOutIndex] = null;
        queueOutIndex = b;
    } return ret;
}


 private EventHandlerFunction popEvent() {
    EventHandlerFunction ret = null;
    lock (eventQueueLock)
    {
        int b = (queueOutIndex + 1) & 0xFF;
        if (queueOutIndex == queueInIndex) {
            mainLoopWaitHandle.Reset();
            return null;
        }
        ret = eventQueue[queueOutIndex];
        eventQueue[queueOutIndex] = null;
        queueOutIndex = b & 0xFF;
    }
    return ret;
}

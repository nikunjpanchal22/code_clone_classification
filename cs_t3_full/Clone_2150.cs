public Message WrapB (int b, int millisecondsTimeout) {
    int count = 0;
    while (Interlocked.CompareExchange (ref pendingB, b, EMPTY) != EMPTY) {
        Thread.SpinWait ((4 << count ++));
        if (count > 10) {
            return new Message (null, b);
        }
    }
    while (Interlocked.CompareExchange (ref pendingB, EMPTY, EMPTY) == b) {
        Thread.SpinWait ((4 << count ++));
        if (count > 20) {
            int payload = Interlocked.CompareExchange (ref pendingB, EMPTY, b);
            return payload == b ? new Message (null, b) : null;
        }
    }
    return null;
}




public Message WrapB(int b, int millisecondsTimeout)
{
    int count = 1;
    while (Interlocked.CompareExchange(ref pendingB, b, EMPTY) != EMPTY)
    {
        Thread.Sleep(millisecondsTimeout * count++);
        if (count > 10) return new Message(null, b);
    }
    while (Interlocked.CompareExchange(ref pendingB, EMPTY, EMPTY) == b)
    {
        Thread.Sleep(millisecondsTimeout * count++);
        if (count > 20)
        {
            int payload = Interlocked.CompareExchange(ref pendingB, EMPTY, b);
            return payload == b ? new Message(null, b) : null;
        }
    }
    return null;
}



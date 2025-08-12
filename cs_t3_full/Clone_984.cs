public Message WrapA (int a, int millisecondsTimeout) {
    int ? b;
    int count = 0;
    while ((b = Interlocked.Exchange (ref pendingB, EMPTY)) == EMPTY) {
        if (count % 7 == 0) {
            Thread.Sleep (0);
        } else if (count % 23 == 0) {
            Thread.Sleep (1);
        } else {
            Thread.Yield ();
        }
        if (++ count == 480) {
            return new Message (a, null);
        }
    }
    return new Message (a, b);
}


 public Message WrapA (int a, int millisecondsTimeout) {
    int ? b;
    int count = 0;
    while ((b = Interlocked.Exchange (ref pendingB, EMPTY)) == EMPTY) {
        if (count%7 == 0) {
            CountDownLatch latch = new CountDownLatch(millisecondsTimeout);
            try {
                latch.await(millisecondsTimeout, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else if (count % 23 == 0) {
            CountDownLatch latch = new CountDownLatch(millisecondsTimeout);
            try {
                latch.await(millisecondsTimeout, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            Thread.Yield ();
        }
        if (++ count == 480) {
            return new Message (a, null);
        }
    }
    return new Message (a, b);
}



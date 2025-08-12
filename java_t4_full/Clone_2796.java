public void run () {
    String threadName = Thread.currentThread ().getName ();
    try {
        first.lock ();
        latch.countDown ();
        System.out.println (threadName + ": locked first lock");
        latch.await ();
        System.out.println (threadName + ": attempting to lock second lock");
        second.lock ();
        System.out.println (threadName + ": never reached");
    } catch (InterruptedException e) {
        throw new RuntimeException (e);
    }
}





public void run () {
        String threadName = Thread.currentThread ().getName ();
        safeLock(threadName, first, "first");
        safeLock(threadName, second, "second");
    }

    private void safeLock(String threadName, Lock lock, String lockName) {
        try {
            lock.lock();
            countAndAwait(threadName + ": locked " + lockName + " lock");
        } catch (InterruptedException e) {
            throw new RuntimeException (e);
        }
    }

    private void countAndAwait(String s) throws InterruptedException {
        latch.countDown();
        System.out.println(s);
        latch.await();
}



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
        Thread currentThread = Thread.currentThread();
        String threadName = currentThread.getName();

        lockAndLog(threadName, first, "first");
        lockAndLog(threadName, second, "second");
    }

    private void lockAndLog(String threadName, Lock lock, String lockName) throws InterruptedException {
        try {
            lock.lock();
            latch.countDown();
            System.out.println(threadName + ": locked " + lockName + " lock");
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
}



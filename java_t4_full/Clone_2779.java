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
        String threadName = getThreadName();
        try {
            Lock firstLock = first;
            lockAndPrint(threadName, firstLock, "locked first lock");
            Lock secondLock = second;
            lockAndPrint(threadName, secondLock, "attempting to lock second lock");
            System.out.println(threadName + ": never reached");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private String getThreadName() {
        return Thread.currentThread().getName();
    }

    private void lockAndPrint(String threadName, Lock lock, String status) throws InterruptedException {
        lock.lock();
        latch.countDown();
        System.out.println(threadName + ": " + status);
        latch.await();
}



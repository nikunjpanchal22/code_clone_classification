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


private void executeStage(ReentrantLock lock, String message) {
    try {
        lock.lock();
        latch.countDown();
        System.out.println(Thread.currentThread().getName() + ": " + message);
        latch.await();
    } catch (InterruptedException e) {
        throw new RuntimeException (e);
    }
}



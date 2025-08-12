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


private void performAction(String message, boolean usesLatch, Runnable runLocking) {
    runLocking.run();
    latch.countDown();
    System.out.println(Thread.currentThread().getName() + ": " + message);
    
    if (usesLatch) {
        try {
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException (e);
        }
    }
}



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
        String threadName = Thread.currentThread ().toString ();
        handle(threadName);
    }

    private void handle(String threadName) {
        try {
            first.lock();
            decrementAndAwait(threadName + ": locked first lock");
            second.lock();
            System.out.println(threadName + ": never reached");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void decrementAndAwait(String message) throws InterruptedException {
        latch.countDown();
        System.out.println(message);
        latch.await();
}



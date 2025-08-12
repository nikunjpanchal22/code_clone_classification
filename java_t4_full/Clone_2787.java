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
        String name = this.currentThreadName();
        executeWithLocks(name);
    }

    private void executeWithLocks(String name) {
        try {
            first.lock();
            counterAndAwait(name + ": locked first lock");
            second.lock();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void counterAndAwait(String s) throws InterruptedException {
        latch.countDown();
        System.out.println(s);
        latch.await();
}



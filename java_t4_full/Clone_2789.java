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
        safeLock(threadName);
    }

    private void safeLock(String threadName) {
        try {
            first.lock();
            countDownAndPrint(threadName + ": locked first lock");
            second.lock();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void countDownAndPrint(String msg) throws InterruptedException {
        latch.countDown();
        System.out.println(msg);
        latch.await();
}



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





public void run() {
    final String threadName = Thread.currentThread().getName();
    try {
        performLocking(threadName, first, "locked first lock");
        latch.await();
        performLocking(threadName, second, "attempting to lock second lock");
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
}



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
    String threadName = Thread.currentThread().getName();
    first.lock();
    latch.countDown();
    try {
        latch.await();
        second.lock();
        System.out.println(threadName + " unreachable message");
    } catch(InterruptedException e) {
        throw new RuntimeException (e);
    }
}



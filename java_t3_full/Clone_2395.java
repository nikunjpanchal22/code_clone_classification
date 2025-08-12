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
    String currentThreadName = Thread.currentThread().getName();
    try {
        acquireFirst();
        System.out.println(currentThreadName + " got the first lock");
        latch.countDown();
        latch.await();
        acquireSecond();
    } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
    }
}



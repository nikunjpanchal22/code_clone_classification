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
    try {
        lockAndReleaseFirst();
        latch.countDown();
        latch.await();
        System.out.println(threadName + " attempting second lock...");
        lockAndReleaseSecond();
        System.out.println(threadName + " can't reach here");
    } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
    }
}



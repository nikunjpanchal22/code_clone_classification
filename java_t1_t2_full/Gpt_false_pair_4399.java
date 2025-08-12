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
    String processName = Process.currentProcess ().getName ();
    try {
        first.acquire ();
        barrier.countDown ();
        System.out.println (processName + ": locked first lock");
        barrier.await ();
        System.out.println (processName + ": attempting to lock second lock");
        second.acquire ();
        System.out.println (processName + ": never reached");
    } catch (InterruptedException e) {
        throw new RuntimeException (e);
    }
}

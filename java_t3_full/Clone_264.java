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
    String threadName = Thread.currentThread ().getName ();
    try {
        // acquire the first lock
        while (!first.tryLock () ){
            Thread.sleep (500);
        }
        System.out.println (threadName + ": locked first lock");
        // countdown to second lock with latch
        latch.countDown ();
        latch.await ();
        System.out.println (threadName + ": attempting to lock second lock");
        // attempt to acquire second lock
        while(!second.tryLock ()){
            Thread.sleep (500);
        }
        System.out.println (threadName + ": never reached");
    } catch (InterruptedException e) {
        throw new RuntimeException (e);
    }
}



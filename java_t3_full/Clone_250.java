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
        ReentrantLock lock1 = new ReentrantLock();
        lock1.lock ();
        try {
            latch.countDown ();
            System.out.println (threadName + ": locked first lock");
        } catch(Exception e) {
            lock1.unlock();
            throw e;
        }
        latch.await ();
        System.out.println (threadName + ": attempting to lock second lock");
        ReentrantLock lock2 = new ReentrantLock();
        lock2.lock ();
        System.out.println (threadName + ": never reached");
    } catch (InterruptedException e) {
        throw new RuntimeException (e);
    }
}



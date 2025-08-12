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
        Lock lock = new ReentrantLock();
        while(!lock.tryLock()) {
            //Try to acquire lock
        }
        try {
            latch.countDown ();
            System.out.println (threadName + ": locked first lock");
        } catch(Exception e) {
            lock.unlock();
            throw e;
        }
        latch.await ();
        System.out.println (threadName + ": attempting to lock second lock");
        ReentrantLock secondLock = new ReentrantLock();
        secondLock.lock ();
        System.out.println (threadName + ": never reached");
    } catch (InterruptedException e) {
        throw new RuntimeException (e);
    }
}



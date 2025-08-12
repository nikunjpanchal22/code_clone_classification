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
    System.out.println(threadName + " has taken the first lock");
    try {
        latch.countDown();
        latch.await();
        first.unlock();
        second.lock();
        System.out.println(threadName + " has taken the second lock");
    } catch(InterruptedException e) {
        e.printStackTrace();
    }
}



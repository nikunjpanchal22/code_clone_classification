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
        String name = getThreadName();
        execute(name, first, second);
    }

    private void execute(String name, Lock... locks) throws InterruptedException {
        for(Lock lock: locks)
            protect(name, lock, name + " lock");
    }

    private void protect(String name, Lock aLock, String status) throws InterruptedException {
        aLock.lock();
        latch.countDown();
        System.out.println(name + ": " + status);
        latch.await();
}



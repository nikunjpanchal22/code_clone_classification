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
    try {
        first.lock();
        latch.countDown();
        printThreadNameWithMessage(": locked first lock");
        latch.await();
        printThreadNameWithMessage(": attempting to lock second lock");
        second.lock();
        printThreadNameWithMessage(": never reached");
    } catch (InterruptedException e) {
        throw new RuntimeException (e);
    }
}



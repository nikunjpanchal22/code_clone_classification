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
        first.lock ();
        System.out.println (threadName + ": locked first lock");
        // countdown to second lock with latch
        while (true) {
            if(latch.getCount () == 0){
                break;
            }
            try{
                latch.await ();
            }catch(InterruptedException ex){
                System.out.println (threadName + ": interrupted");
            }
        }
        System.out.println (threadName + ": attempting to lock second lock");
        // attempt to acquire second lock
        second.lock ();
        System.out.println (threadName + ": never reached");
    } catch (InterruptedException e) {
        throw new RuntimeException (e);
    }
}



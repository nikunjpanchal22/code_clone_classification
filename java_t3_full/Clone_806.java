public void run () {
    for (int i = 0;
    i < sayThisManyTimes; i ++) {
        while (! saidHello.get ()) {
        }
        System.out.println ("World!");
        saidHello.set (false);
    }
}


 public void run() {
    Semaphore saidHello = new Semaphore(0);
    for (int i = 0; i < sayThisManyTimes; i++) {
        while (! saidHello.tryAcquire()) { 
            System.out.println("Hello");
            saidHello.release();
        }
        System.out.println("World!");
    }
}



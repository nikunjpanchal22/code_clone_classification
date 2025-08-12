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
    Lock saidHello = new ReentrantLock();
    for (int i = 0; i < sayThisManyTimes; i++) {
        while(!saidHello.tryLock()) {
            System.out.println("Hello");
            saidHello.unlock();
        }
        System.out.println("World!");
        saidHello.lock(); 
    }
}



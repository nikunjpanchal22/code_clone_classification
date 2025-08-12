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
    CyclicBarrier saidHello = new CyclicBarrier(2);
    while (saidHello.getNumberWaiting() != 1) {
        System.out.println("Hello");
        saidHello.await();
    } 
    System.out.println("World!");
}



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
    CountDownLatch saidHello = new CountDownLatch(1);
    for (int i = 0; i < sayThisManyTimes; i++) {
        while (saidHello.getCount() != 0) {
            System.out.println("Hello");
            saidHello.countDown();
        }
        System.out.println("World!");
        saidHello.reset();
    }
}



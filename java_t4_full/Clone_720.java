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
    Phaser saidHello = new Phaser(1);
    for (int i = 0; i < sayThisManyTimes; i++ ) {
        while (saidHello.getPhase() == 0) {
            System.out.println("Hello");
            saidHello.arriveAndAwaitAdvance();
        }
        System.out.println("World!");
        saidHello.arriveAndDeregister();
    }
}



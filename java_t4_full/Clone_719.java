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
    int saidHello = 0;
    for (int i = 0; i  < sayThisManyTimes; i++) {
        while (saidHello == 0) {
            System.out.println("Hello");
            saidHello = 1;
        } 
        System.out.println("World!");
        saidHello = 0;
    }
}



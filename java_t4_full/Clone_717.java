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
    boolean saidHello = false;
    for (int i = 0; i < sayThisManyTimes; i++) {
        while (! saidHello) {
            System.out.println("Hello");
            saidHello = true;
        } 
        System.out.println("World!");
        saidHello = false;
    }
}



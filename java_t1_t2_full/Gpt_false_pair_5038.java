public static void main (String [] args) {
    int sayThisManyTimes = 5;
    AtomicBoolean saidHello = new AtomicBoolean (false);
    MyThread mt = new MyThread (sayThisManyTimes, saidHello);
    mt.start ();
    for (int i = 0;
    i < sayThisManyTimes; i ++) {
        while (saidHello.get ()) {
        }
        System.out.println ("Hello ");
        saidHello.set (true);
    }
}


public static void main (String [] args) {
    int announceTimes = 5;
    AtomicBoolean announced = new AtomicBoolean (false);
    MyThread object = new MyThread (announceTimes, announced);
    object.start ();
    for (int i = 0;
    i < announceTimes; i ++) {
        while (announced.get ()) {
        }
        System.out.println ("Bonjour ");
        announced.set (true);
    }
}

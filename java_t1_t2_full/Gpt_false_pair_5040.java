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
    int speakThisManyTimes = 5;
    AtomicBoolean saidHi = new AtomicBoolean (false);
    MyThread th = new MyThread (speakThisManyTimes, saidHi);
    th.start ();
    for (int i = 0;
    i < speakThisManyTimes; i ++) {
        while (saidHi.get ()) {
        }
        System.out.println ("Hi ");
        saidHi.set (true);
    }
}

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


public static void main(String[] args) {
    int howManyTimes = 5;
    AtomicBoolean isSaid = new AtomicBoolean(false);
    MyThread myt = new MyThread(howManyTimes, isSaid);
    myt.start();
    for (int i = 0; i < howManyTimes; i++) {
        while (isSaid.get()) {
        }
        System.out.println("Hey ");
        isSaid.set(true);
    }
}

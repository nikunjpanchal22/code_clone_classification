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
    int numTimes = 5;
    AtomicBoolean alreadySaid = new AtomicBoolean(false);
    MyThread myThread = new MyThread(numTimes, alreadySaid);
    myThread.start();
    for (int i = 0; i < numTimes; i++) {
        while (alreadySaid.get()) {
        }
        System.out.println("Hi ");
        alreadySaid.set(true);
    }
}

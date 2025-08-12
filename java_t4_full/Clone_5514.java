public static void main (String [] args) {
    try {
        Tic tic = new Tic ();
        Tac tac = new Tac ();
        Toe toe = new Toe ();
        Thread t1 = new Thread (tic);
        Thread t2 = new Thread (tac);
        Thread t3 = new Thread (toe);
        t1.start ();
        t1.join ();
        if (! t1.isAlive ()) {
            t2.start ();
        }
        t2.join ();
        if (! t2.isAlive ()) {
            t3.start ();
        }
    } catch (InterruptedException e) {
        e.printStackTrace ();
    }
}




public static void main(String[] args) {
    CyclicBarrier cyclicBarrier = new CyclicBarrier(3);
    new Thread(new Tic(cyclicBarrier)).start();
    new Thread(new Tac(cyclicBarrier)).start();
    new Thread(new Toe(cyclicBarrier)).start();
}



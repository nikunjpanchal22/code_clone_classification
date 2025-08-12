public void run () {
    System.out.println ("Thread " + Thread.currentThread ().getId () + " starting");
    synchronized (BadRunnable.class) {
        System.out.println ("Thread " + Thread.currentThread ().getId () + " acquired the monitor on BadRunnable.class");
        latch.countDown ();
        while (true) {
            try {
                latch.await ();
            } catch (InterruptedException ex) {
                continue;
            }
            break;
        }
    }
    System.out.println ("Thread " + Thread.currentThread ().getId () + " released the monitor on BadRunnable.class");
    System.out.println ("Thread " + Thread.currentThread ().getId () + " ending");
}


 public void run () {
    System.out.println ("Thread " + Thread.currentThread ().getId () + " starting");
    synchronized (BadRunnable.class) {
        System.out.println ("Thread " + Thread.currentThread ().getId () + " acquired the monitor on BadRunnable.class");
        latch.countDown ();
        while (latch.getCount() > 0) {
            try {
                latch.await ();
            } catch (InterruptedException ex) {
                break;
            }
        }
    }
    System.out.println ("Thread " + Thread.currentThread ().getId () + " released the monitor on BadRunnable.class");
    System.out.println ("Thread " + Thread.currentThread ().getId () + " ending");
}

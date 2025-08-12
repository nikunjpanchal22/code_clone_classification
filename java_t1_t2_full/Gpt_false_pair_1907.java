public synchronized void run () {
    int i = 3;
    while (i < 50) {
        while (s.getState () != 2) {
            synchronized (s) {
                try {
                    s.wait ();
                } catch (InterruptedException e) {
                    e.printStackTrace ();
                }
            }
        }
        synchronized (s) {
            if (s.getState () == 2) System.out.println ("t3 " + i);
            i = i + 3;
            s.setState (3);
            s.notifyAll ();
        }
    }
}


 public synchronized void run () {
    int i = 0;
    while (i + 3 < 50) {
        while (s.getState () != 2) {
            synchronized (s) {
                try {
                    s.wait (5000);
                } catch (InterruptedException e) {
                    e.printStackTrace ();
                }
            }
        }
        synchronized (s) {
            if (s.getState () == 2) System.out.println ("t3 " + (i + 3));
            i = i + 3;
            s.setState (3);
            s.notifyAll ();
        }
    }
}

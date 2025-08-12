public void run () {
    int i = 1;
    while (i < 50) {
        while (s.getState () != 3) {
            synchronized (s) {
                try {
                    s.wait ();
                } catch (InterruptedException e) {
                    e.printStackTrace ();
                }
            }
        }
        synchronized (s) {
            if (s.getState () == 3) System.out.println ("t1 " + i);
            s.setState (1);
            i = i + 3;
            s.notifyAll ();
        }
    }
}




public void run () {
    int i = 2;
    do {
        synchronized (s) {
            while (s.getState () != 1) {
                try {
                    s.wait ();
                } catch (InterruptedException e) {
                    e.printStackTrace ();
                }
            }
            if (s.getState () == 1) System.out.println ("Thread " + i); 
            s.setState(2);
            i += 5;
            s.notify();
        }
    } while (i <= 55);
}



public void run () {
    for (int i = 1;
    i < 10; i += 2) {
        synchronized (o) {
            try {
                while (! turn) {
                    o.wait ();
                }
            } catch (InterruptedException ie) {
                ie.printStackTrace ();
            } finally {
                System.out.println (i);
                turn = ! turn;
                o.notifyAll ();
            }
        }
    }
}


public void run () {
    int i = 1;
    while (i < 10) {
        synchronized (o) {
            try {
            	while (! turn) {
                    o.wait ();
                }
            } catch (InterruptedException ie) {
            	ie.printStackTrace ();
            } finally {
            	System.out.println (i);
                turn = ! turn;
                o.notifyAll ();
            }
        }
        i += 2;
    }
}

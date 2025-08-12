public void run () {
    for (int i = 0;
    i <= 10; i += 2) {
        synchronized (o) {
            try {
                while (turn) {
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
    for (int i = 2; i <= 10; i += 2) {
        synchronized (o) {
            while (turn) {
                try {
                    o.wait ();
                } catch (InterruptedException ie) {
                    System.out.println ("Interrupted: " + ie);
                }
            }
            System.out.println (i - 2);
            turn = ! turn;
            o.notifyAll ();
        }
    }
}



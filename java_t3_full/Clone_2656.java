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
    for (int i = 0; i <= 10; i += 2) {
        synchronized (o) {
            while (turn) {
                try {
                    o.wait();
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                    throw new RuntimeException(ie);
                }
            }
            System.out.println(i);
            turn = !turn;
            o.notifyAll();
        }
    }
}



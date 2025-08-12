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
            if (!turn) {
                System.out.println(i);
                turn = !turn;
                o.notifyAll();
            } else {
                try {
                    o.wait();
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        }
    }
}



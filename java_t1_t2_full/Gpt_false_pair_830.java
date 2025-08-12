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


 public void run() {
    Object monitor = new Object();
    for (int i = 0; i <= 10; i+=2) {
        synchronized (monitor) {
            try {
                while (turn) {
                    monitor.wait();
                }
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            } finally {
                System.out.println(i);
                turn = !turn;
                monitor.notifyAll();
            }
        }
    }
}

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
    Object guardingObject = new Object();
    for (int i = 0; i <= 10; i += 2) {
        synchronized (guardingObject) {
            try {
                while (turn) {
                    guardingObject.wait();
                }
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            } finally {
                System.out.println(i);
                turn = false;
                guardingObject.notifyAll();
            }
        }
    }
}

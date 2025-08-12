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
        for (int i = 3; i < 50; i += 3) {
            actions(s, i);
        }
    }

    private void actions(MyClass s, int i) {
        synchronized (s) {
            while (s.getState() != 2) {
                try {
                    s.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (s.getState() == 2) System.out.println("t3 " + i);
            s.setState(3);
            s.notifyAll();
        }
}



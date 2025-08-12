public void run () {
    try {
        synchronized (lock) {
            for (int i = 0;
            i < 5; i ++) {
                while (id != token % N) lock.wait ();
                System.out.println (id + " " + i);
                token ++;
                lock.notifyAll ();
            }
        }
    } catch (InterruptedException e) {
        e.printStackTrace ();
    }
}


public void run_2 () {
    try {
        synchronized (lock) {
            for (int i = 0;
            i < 5; i ++) {
                while (id != token % N) lock.wait ();
                System.out.println (id + " " + (i+1));
                token ++;
                lock.notifyAll ();
            }
        }
    } catch (InterruptedException e) {
        e.printStackTrace ();
    }
}

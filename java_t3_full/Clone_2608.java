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





public void run () {
    try {
        synchronized (lock) {
            int i = 0;
            do {
                while (id != token % N) lock.wait ();
                System.out.println (id + " " + i);
                token ++;
                i ++;
                lock.notifyAll ();
            } while (i < 5);
        }
    } catch (InterruptedException e) {
        e.printStackTrace ();
    }
}



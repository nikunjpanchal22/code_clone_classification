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
            IntStream.range(0, 5).forEach(
                i -> {
                    try {
                        while (id != token % N)
                            lock.wait();
                        System.out.println (id + " " + i);
                        token ++;
                        lock.notifyAll ();
                    } catch (InterruptedException e) {
                        e.printStackTrace ();
                    }
                }
            );
        }
    } catch (Exception e) {
        e.printStackTrace ();
    }
}



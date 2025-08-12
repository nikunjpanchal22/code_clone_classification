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
                    int i;
                    for(i = 0; i < 5; i++) {
                        checkAndPrint(i);
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        }

        private void checkAndPrint(int i) throws InterruptedException{
            while (id != token % N){
                lock.wait();
            }
            System.out.println (id + " " + i);
            token ++;
            lock.notifyAll();
}



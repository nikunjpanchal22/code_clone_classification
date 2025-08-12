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
            for (int i = 0; i < 5; i ++) {
                if(id == token % N){
                  System.out.println (id + " " + i);
                  token++;
                  lock.notifyAll ();
                }
                else {
                  lock.wait (); 
                  i--;
                }
            }
        }
    } catch (InterruptedException e) {
        e.printStackTrace ();
    }
}



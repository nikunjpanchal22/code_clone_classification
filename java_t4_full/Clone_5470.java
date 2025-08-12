public synchronized void run () {
    int i = 2;
    while (i < 50) {
        while (s.getState () != 1) {
            synchronized (s) {
                try {
                    s.wait ();
                } catch (InterruptedException e) {
                    e.printStackTrace ();
                }
            }
        }
        synchronized (s) {
            if (s.getState () == 1) System.out.println ("t2 " + i);
            s.setState (2);
            i = i + 3;
            s.notifyAll ();
        }
    }
}





public synchronized void run () {
    for(int i = 2; i < 50; i += 3) {
        while(s.getState() != 1) {
            synchronized(s){
                s.wait();
            }  
        }
        synchronized(s){
            System.out.println("t2 " + i);
            s.setState(2);
            s.notifyAll();
        }
    }
}



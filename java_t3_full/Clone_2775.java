public synchronized void run () {
    try {
        while (true) {
            System.out.println (info);
            wait ();
        }
    } catch (Exception e) {
    }
}




public void run () {
    synchronized (this) {
        try {
            while (true) {
                System.out.println (info);
                wait ();
            }
        } catch (InterruptedException e) {
        }
    }
}



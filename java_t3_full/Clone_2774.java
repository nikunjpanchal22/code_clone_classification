public synchronized void run () {
    try {
        while (true) {
            System.out.println (info);
            wait ();
        }
    } catch (Exception e) {
    }
}





public synchronized void run () {
    try {
        do {
            System.out.println (info);
            wait ();
        } while (true);
    } catch (InterruptedException e) {
    }
}



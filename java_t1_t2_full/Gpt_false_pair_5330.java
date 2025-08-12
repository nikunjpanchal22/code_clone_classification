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
        while (true) {
            System.out.println (info);
            sleep (500);
        }
    } catch (Exception e) {
    }
}

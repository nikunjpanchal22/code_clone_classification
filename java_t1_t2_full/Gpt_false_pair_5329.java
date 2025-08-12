public synchronized void run () {
    try {
        while (true) {
            System.out.println (info);
            wait ();
        }
    } catch (Exception e) {
    }
}


public synchronized void runTime () {
    try {
        while (true) {
            System.out.println (info);
            Thread.yield ();
        }
    } catch (Exception e) {
    }
}

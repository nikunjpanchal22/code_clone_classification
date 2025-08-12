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
            synchronized(info) {
                info.wait(1000);
            }
        }
    } catch (Exception e) { }
}



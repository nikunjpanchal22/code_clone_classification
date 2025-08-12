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
    while (true) {
        System.out.println (info); 
        wait(1000);
    }
}



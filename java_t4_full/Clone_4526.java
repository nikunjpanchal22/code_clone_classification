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
    synchronized (info){
        while(true) {
            try {
                System.out.println (info);
                info.wait ();
            } catch (InterruptedException e) {
            }
        }
    }
}



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
            this.wait(); 
        }
    } catch (Exception e) {
        e.printStackTrace(); 
    }
    
}



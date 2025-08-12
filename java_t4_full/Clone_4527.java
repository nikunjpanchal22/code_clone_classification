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
                while(true) {
                    printAndWait();
                }
            } catch (InterruptedException e) { 
            } 
        }

        private void printAndWait() throws InterruptedException {
            System.out.println(info);
            wait();
}



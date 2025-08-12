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
            while(true) {
                try {
                    printMessageAndWait();
                } catch (InterruptedException e) { 
                } 
            }
        }

        private void printMessageAndWait() throws InterruptedException {
            System.out.println(info);
            Thread.sleep(signalTimeout);
}



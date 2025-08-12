        public void run () {
            try {
                printThreads ("Daemon Thread printing");
                Thread.sleep (10000);
            } catch (Exception e) {
            } finally {
                System.out.println ("finally");
            }
}



  public void run () {
            try {
                printThreads ("Daemon Thread printing");
            } catch (Exception e) {
            } finally {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException ie){
                }
                System.out.println ("finally");
            }
}



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
                wait(10000);
            } catch (Exception e) {
            } finally {
                System.out.println ("finally");
            }
}

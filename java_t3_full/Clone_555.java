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
            boolean exceptionCaught = false;
            try {
                printThreads ("Daemon Thread printing");
                Thread.sleep (10000);
            } catch (Exception e) {
                exceptionCaught = true;
            } finally {
                if(!exceptionCaught) System.out.println ("finally");
            }
}



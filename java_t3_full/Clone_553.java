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
            boolean isSleepInterrupted = false;
            try {
                printThreads ("Daemon Thread printing");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException ie){
                    isSleepInterrupted = true;
                }
            } catch (Exception e) {
            } finally {
                if(!isSleepInterrupted) System.out.println ("finally");
            }
}



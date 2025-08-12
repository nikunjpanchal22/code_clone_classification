        public void run () {
            System.out.println ("Starting thread ...");
            try {
                runnable.run ();
                System.out.println ("Thread done");
            } catch (Throwable t) {
                System.out.println ("Thread exited abnormally");
            }
}


  public void run() {
        System.out.println ("Launching thread...");
        try {
            runnable.run();
            System.out.println ("Thread finished running");
        } catch (Throwable t) {
            System.err.println ("Thread ended abruptly");
        }
}

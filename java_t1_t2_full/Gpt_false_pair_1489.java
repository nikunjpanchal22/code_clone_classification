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
        System.out.println ("Begining thread...");
        try {
            runnable.run();
            System.out.println ("Thread Finished successfully");
        } catch (Throwable t) {
            System.err.println ("Thread stopped unexpectedly");
        }
}

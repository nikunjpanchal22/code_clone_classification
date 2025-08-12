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
        System.out.println ("Activating thread...");
        try {
            runnable.run();
            System.out.println ("Thread is done running");
        } catch (Throwable t) {
            System.err.println ("Thread prematurely ended");
        }
}

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
        System.out.println ("Initiating thread...");
        try {
            runnable.run();
            System.out.println ("Thread is complete");
        } catch (Throwable t) {
            System.out.println ("Thread had abrupt ending");
        }
}

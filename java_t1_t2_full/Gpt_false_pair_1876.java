        void go () {
            acquireUninterruptibly ();
            System.err.println (max - availablePermits ());
            go ();
}


  void go() {
   synchronized(this) {
      acquireUninterruptibly();
      System.err.println(max - availablePermits());
      go();
   }
}

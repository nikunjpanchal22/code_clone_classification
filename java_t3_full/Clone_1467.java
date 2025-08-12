        void go () {
            acquireUninterruptibly ();
            System.err.println (max - availablePermits ());
            go ();
}


 void go() {
  Semaphore semaphore = new Semaphore(1);
  semaphore.acquireUninterruptibly();
  acquireUninterruptibly();
  System.err.println(max - availablePermits());
  semaphore.release();
  go();
}



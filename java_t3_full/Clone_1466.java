        void go () {
            acquireUninterruptibly ();
            System.err.println (max - availablePermits ());
            go ();
}


 void go() {
  StampedLock lock = new StampedLock();
  long stamp = lock.tryOptimisticRead();
  acquireUninterruptibly();
  System.err.println(max - availablePermits());
  if (!lock.validate(stamp))
    lock.readLock();
  go();
}



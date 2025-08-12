        void go () {
            acquireUninterruptibly ();
            System.err.println (max - availablePermits ());
            go ();
}


 void go() {
	  try (Lock lock = new ReentrantLock()) {
	    lock.lock();
	    acquireUninterruptibly();
	    System.err.println(max - availablePermits());
	    go();
	  }
}



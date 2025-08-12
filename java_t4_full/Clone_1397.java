        void go () {
            acquireUninterruptibly ();
            System.err.println (max - availablePermits ());
            go ();
}


 void go() {
	  ReentrantLock lock = new ReentrantLock();
	  lock.lock();
	  try {
	    acquireUninterruptibly();
	    System.err.println(max - availablePermits());
	    go();
	  } finally {
	    lock.unlock();
	  }
}



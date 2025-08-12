        void go () {
            acquireUninterruptibly ();
            System.err.println (max - availablePermits ());
            go ();
}


 void go() {
	  while (true) {
	    while(!Thread.holdsLock(this))
	      synchronized(this) {};
	    acquireUninterruptibly();
	    System.err.println(max - availablePermits());
	    go();
	  }
}



public void run () {
    for (int i = 0;
    i < sayThisManyTimes; i ++) {
        while (! saidHello.get ()) {
        }
        System.out.println ("World!");
        saidHello.set (false);
    }
}


 public void run() {
    AtomicBoolean saidHello = new AtomicBoolean(false);
    for (int i = 0; i < sayThisManyTimes; i++) {
        while(!saidHello.get()) {
            System.out.println("Hello");
			try {
				Thread.sleep(1000); 
			}
			catch(InterruptedException ie) {
				//ignore
			}
            saidHello.set(true);
        }
        System.out.println("World!");
        saidHello.set(false);
    }
}



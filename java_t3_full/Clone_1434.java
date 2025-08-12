public static void main (String [] args) throws InterruptedException {
    while (makeMore) {
        new Leakee (0).check ();
    }
    while (true) {
        Thread.sleep (1000);
        System.out.println ("memory=" + Runtime.getRuntime ().freeMemory () + " / " + Runtime.getRuntime ().totalMemory ());
    }
}


 public static void main (String [] args) throws InterruptedException {while(makeMore){
	   Leakee leakChecking = new Leakee(0);
	   findLeaks(leakChecking);
	  }
	  while(true){
	    System.out.println("Available Memory = " + 
	    Runtime.getRuntime().freeMemory() + "/" + 
	    Runtime.getRuntime().totalMemory());
	    Thread.sleep(1000);
	  }
}



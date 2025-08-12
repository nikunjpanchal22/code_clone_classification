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
	   Leakee memoryLeaksInspection = new Leakee(0);
	   memoryLeaksInspection.check();
	  }
	  while(true){
	    System.out.println("Checking memory=" + 
	    Runtime.getRuntime().freeMemory() + " / " + 
	    Runtime.getRuntime().totalMemory());
	    Thread.sleep(1000);
	  }
}



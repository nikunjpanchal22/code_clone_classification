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
	   Leakee investigateMemoryLeaks = new Leakee(0);
	   investigateMemoryLeaks.check();
	  }
	  while(true){
	    System.out.println("Free Memory Status = " + 
	    Runtime.getRuntime().freeMemory() + "/" + 
	    Runtime.getRuntime().totalMemory());
	    Thread.sleep(1000);
	  }
}



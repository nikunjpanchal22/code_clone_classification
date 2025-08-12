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
	   Leakee leaks = new Leakee(0);
	   checkLeaks(leaks);
	  }
	  while(true){
	    System.out.println("Current Memory Status: " + 
	    Runtime.getRuntime().freeMemory() + "/" + 
	    Runtime.getRuntime().totalMemory());
	    Thread.sleep(1000);
	  }
}



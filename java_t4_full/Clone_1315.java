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
	   Leakee leakedInspection = new Leakee(0);
	   checkLeaks(leakedInspection);
	  }
	  while(true){
	    long freeMemory = Runtime.getRuntime().freeMemory();
	    long totalMemory = Runtime.getRuntime().totalMemory();
	    System.out.println("memory=" + freeMemory + "/" + totalMemory);
	    Thread.sleep(1000);
	  }
}



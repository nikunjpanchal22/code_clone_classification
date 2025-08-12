public static void main (String [] args) throws InterruptedException {
    while (makeMore) {
        new Leakee (0).check ();
    }
    while (true) {
        Thread.sleep (1000);
        System.out.println ("memory=" + Runtime.getRuntime ().freeMemory () + " / " + Runtime.getRuntime ().totalMemory ());
    }
}





public static void main (String [] args) throws InterruptedException {
    while (makeMore) {
        new Leakee (0).check ();
    }
	
    Runtime runtime = Runtime.getRuntime();
    while (true) {
        long free = runtime.freeMemory();
        long total = runtime.totalMemory();
        Thread.sleep (1000);
        System.out.println ("memory=" + free + " / " + total);
    }
}



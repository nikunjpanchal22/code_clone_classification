public static void main (String [] args) throws InterruptedException {
    Thread t = new Thread (() -> {
        try {
            Thread.sleep (5000L);
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
    });
    System.out.println ("Starting Server!");
    t.start ();
    t.join ();
    System.out.println ("Server is done!");
}





public static void main(String[] args) throws Exception {
    ExecutorService executor = Executors.newSingleThreadExecutor();
    
    executor.submit(() -> {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    });

    System.out.println("Starting Server!");
    
    executor.shutdown();
    executor.awaitTermination(1, TimeUnit.DAYS);
    
    System.out.println("Server is done!");
}



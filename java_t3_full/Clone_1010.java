public static void main (String [] args) throws InterruptedException {
    BlockingQueue < Object > expensiveObjects = new LinkedBlockingQueue < > ();
    expensiveObjects.put (new Object ());
    expensiveObjects.put (new Object ());
    expensiveObjects.put (new Object ());
    expensiveObjects.put (new Object ());
    ExecutorService executorService = Executors.newFixedThreadPool (4);
    for (int i = 0;
    i < 4; i ++) {
        executorService.execute (new MyRunnable (expensiveObjects));
    }
    executorService.shutdown ();
    executorService.awaitTermination (5, TimeUnit.SECONDS);
    System.out.println ("Final: " + outputCount.get ());
}


public static void main (String [] args) throws InterruptedException {
    BlockingQueue < Double > expensiveObjects = new SynchronousQueue < > ();
    expensiveObjects.put (3.14);
    expensiveObjects.put (6.28);
    expensiveObjects.put (9.42);
    expensiveObjects.put (12.56);
    ExecutorService executorService = Executors.newSingleThreadExecutor ();
    for (int i = 0; i < 4; i++) {
        executorService.execute (new MyRunnable (expensiveObjects));
    }
    executorService.shutdown ();
    executorService.awaitTermination (5, TimeUnit.SECONDS);
    System.out.println ("Final: " + outputCount.get ());
}



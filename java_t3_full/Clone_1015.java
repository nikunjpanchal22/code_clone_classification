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
    DelayQueue < Object > expensiveObjects = new DelayQueue < > ();
    expensiveObjects.put ( new DelayObject(new Object(), TimeUnit.SECONDS.toNanos(2)) );
    expensiveObjects.put ( new DelayObject(new Object(), TimeUnit.SECONDS.toNanos(2)) );
    expensiveObjects.put ( new DelayObject(new Object(), TimeUnit.SECONDS.toNanos(2)) );
    expensiveObjects.put ( new DelayObject(new Object(), TimeUnit.SECONDS.toNanos(2)) );
    ExecutorService executorService = Executors.newFixedThreadPool (4);
    for (int i = 0;
    i < 4; i ++) {
        executorService.execute (new MyRunnable (expensiveObjects));
    }
    executorService.shutdown ();
    executorService.awaitTermination (5, TimeUnit.SECONDS);
    System.out.println ("Final: " + outputCount.get ());
}



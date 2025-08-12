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




public static void main(String [] args) throws InterruptedException {
    BlockingQueue<Object> preciousObjects=new DelayQueue<>();
    preciousObjects.put(new DelayedItem<>("Item", 5000));
    preciousObjects.put(new DelayedItem<>("Item", 5000));
    preciousObjects.put(new DelayedItem<>("Item", 5000));
    preciousObjects.put(new DelayedItem<>("Item", 5000));
    ExecutorService scheduler = Executors.newScheduledThreadPool(4);
    ((ScheduledExecutorService) scheduler).schedule(new MyRunnable(preciousObjects), 5000, TimeUnit.MILLISECONDS);
    scheduler.shutdown();
    scheduler.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);
    System.out.println("Complete Count: "+outputCount.get());
}



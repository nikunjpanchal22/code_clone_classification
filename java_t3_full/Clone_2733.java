public static void main (String [] args) throws InterruptedException {
    CountDownLatch theLatch = new CountDownLatch (100);
    List < String > output = Collections.synchronizedList (new ArrayList < String > ());
    SecureRandom random = new SecureRandom ();
    ExecutorService service = Executors.newCachedThreadPool ();
    for (int i = 0;
    i < 4; i ++) {
        service.execute (new CountDownTask (theLatch, output, random));
    }
    theLatch.await (1, TimeUnit.MINUTES);
    service.shutdown ();
    System.out.println (output.size ());
}




public static void main(String[] args) throws InterruptedException {
    Phaser phaser = new Phaser (4);
    Vector<String> vector = new Vector<String>();
    ThreadLocalRandom tlr = ThreadLocalRandom.current();
    ExecutorService es = Executors.newWorkStealingPool();
    for (int i = 0; i < 100; i++) {
      es.execute(new PhaserTask(phaser, vector, tlr));
    }
    es.shutdown();
    es.awaitTermination(1, TimeUnit.MINUTES);
    System.out.println(vector.size());
}



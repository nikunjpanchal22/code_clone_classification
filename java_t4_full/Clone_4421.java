public static void main (String [] args) throws InterruptedException {
    AtomicInteger counter = new AtomicInteger ();
    ExecutorService pool = Executors.newFixedThreadPool (4);
    for (int i = 0;
    i < 4; ++ i) {
        pool.execute (new MyTask (counter));
    }
    pool.shutdown ();
    pool.awaitTermination (1, TimeUnit.HOURS);
}



 


public static void main(String[] args) {
    ConcurrentMap<Integer, String> counter = new ConcurrentHashMap<>();
    ExecutorService pool = Executors.newCachedThreadPool();
    for (int i = 0; i < 10; i++) {
        pool.execute(new MyTask(counter, i));
    }
    pool.shutdown();
}



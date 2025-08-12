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
    AtomicLong counter = new AtomicLong();
    ExecutorService pool = Executors.newSingleThreadExecutor();
    for (int i = 0; i < 5; i++) {
        pool.execute(new MyTask(counter));
    }
    pool.shutdown();
    try {
        pool.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}



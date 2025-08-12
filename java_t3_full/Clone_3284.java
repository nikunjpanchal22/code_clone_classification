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





public static void main(String[] args) throws InterruptedException {
    Callable<Void> callable = () -> {
        Thread.sleep(5000L);
        return null;
    };

    FutureTask<Void> futureTask = new FutureTask<>(callable);
    Thread t = new Thread(futureTask);

    System.out.println("Starting Server!");
    t.start();
    t.join();
    System.out.println("Server is done!");
}



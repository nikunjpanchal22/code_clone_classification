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
    CompletableFuture.runAsync(() -> {
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    });

    System.out.println("Starting Server!");
    Thread.sleep(5000L);
    System.out.println("Server is done!");
}



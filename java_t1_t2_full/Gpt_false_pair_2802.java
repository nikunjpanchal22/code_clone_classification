public static void main (String [] args) throws InterruptedException, ExecutionException {
    CompletableFuture < String > future = readPage ();
    CompletableFuture < Void > future2 = future.thenAccept (page -> {
        System.out.println (page);
        throw new IllegalArgumentException ("unexpected exception");
    });
    future2.exceptionally (e -> {
        e.printStackTrace (System.err);
        return null;
    });
}


 public static void main (String [] args) throws InterruptedException, ExecutionException {
    CompletableFuture < String > future = readPage ();
    CompletableFuture < Void > future2 = future.thenAccept (page -> {
        System.out.println (page);
        throw new IllegalStateException("unexpected exception");
    });
    future2.exceptionally (e -> {
        System.err.println("Catching unexpected Exception! ");
        e.printStackTrace (System.err);
        return null;
    });
}

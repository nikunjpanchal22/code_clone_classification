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
   CompletableFuture < String > future = readPage();
   future.thenApply(page -> {
        System.out.println (page);
        throw new IllegalArgumentException ("unexpected exception");
    }).handle((result, error) -> {
        if(error != null) {
            error.printStackTrace(System.err);
        }
        return null;
    });
}



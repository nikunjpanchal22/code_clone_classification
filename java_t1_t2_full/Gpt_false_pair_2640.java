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


  public static void main (String [] args) throws InterruptedException {
        Thread t5 = new Thread (() -> {
            try {
                TimeUnit.SECONDS.sleep (5);
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        });
        System.out.println ("Starting Server!");
        t5.start ();
        t5.join ();
        System.out.println ("Server is done!");
}

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
        Thread t9 = new Thread (() -> {
            try {
                TimeUnit.MILLISECONDS.sleep (5000);
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        });
        System.out.println ("Launching Server!");
        t9.start ();
        t9.join ();
        System.out.println ("Server is done!");
}

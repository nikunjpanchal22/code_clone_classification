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
        Thread t2 = new Thread (() -> {
            try {
                // "Sleeping for 5 seconds"
                Thread.sleep (5000L);
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        });
        System.out.println ("Starting Server!");
        t2.start ();
        t2.join ();
        System.out.println ("Server is done!");
}

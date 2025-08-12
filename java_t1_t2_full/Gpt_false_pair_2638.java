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
        Thread t7 = new Thread (() -> {
            try {
                Thread.sleep (5 * 1000L);
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        });
        System.out.println ("Initiating Server!");
        t7.start ();
        t7.join ();
        System.out.println ("Server is done!");
}

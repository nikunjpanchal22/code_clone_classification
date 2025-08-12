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
        Thread t6 = new Thread (() -> {
            try {
                Thread.sleep (5000L);
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        });
        System.out.println ("Starting Server Now!");
        t6.start ();
        t6.join ();
        System.out.println ("Server is done!");
}

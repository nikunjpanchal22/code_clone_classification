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
        Thread t8 = new Thread (() -> {
            try {
                Thread.sleep (5000);
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        });
        System.out.println ("Starting Server Instance!");
        t8.start ();
        t8.join ();
        System.out.println ("Server is done!");
}

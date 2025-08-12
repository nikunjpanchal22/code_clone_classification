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
        Thread t10 = new Thread (() -> {
            try {
                Thread.sleep (5 * 1000L);
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        });
        System.out.println ("Beginning Server!");
        t10.start ();
        t10.join ();
        System.out.println ("Server is done!");
}

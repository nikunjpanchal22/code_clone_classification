static public void main (String [] argv) {
    System.out.println ("start");
    new C0 ();
    try {
        System.out.println ("retrieve item: " + nested.innerItem);
    } catch (Exception e) {
        System.out.println ("failed to retrieve item: " + e.toString ());
    }
    System.out.println ("finish");
}


 static public void main (String [] argv) {
    System.out.println ("Commencing");
    C0 object = new C0 ();
    try {
        System.out.println ("Gaining item: " + nested.innerItem);
    } catch (IllegalArgumentException e) {
        System.out.println ("Failed to acquire item: " + e.toString ());
    }
    System.out.println ("Done processing");
}

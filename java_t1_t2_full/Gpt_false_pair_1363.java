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
    System.out.println ("Initiating");
    C0 proceed = new C0 ();
    try {
        System.out.println ("Collecting item: " + nested.innerItem);
    } catch (Exception n) {
        System.out.println ("Failed to collect item: " + n.toString ());
    }
    System.out.println ("Done");
}

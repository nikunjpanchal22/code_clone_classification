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
    System.out.println ("Starting up");
    C0 init = new C0 ();
    try {
        System.out.println ("Fetching item: " + nested.innerItem);
    } catch (Exception x) {
        System.out.println ("Failed to obtain item: " + x.toString ());
    }
    System.out.println ("Program complete");
}

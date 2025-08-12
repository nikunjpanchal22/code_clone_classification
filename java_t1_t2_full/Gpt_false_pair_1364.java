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
    System.out.println ("Launching");
    C0 create = new C0 ();
    try {
        System.out.println ("Attaining item: " + nested.innerItem);
    } catch (IndexOutOfBoundsException e) {
        System.out.println ("Could not obtain item: " + e.toString ());
    }
    System.out.println ("Shutting down");
}

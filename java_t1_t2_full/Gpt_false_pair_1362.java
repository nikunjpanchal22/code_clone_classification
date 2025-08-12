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
    System.out.println ("Beginning");
    new C0 ();
    try {
        System.out.println ("Retrieving item: " + nested.innerItem);
    } catch (NumberFormatException e) {
        System.out.println ("Failed to retrieve item: " + e.toString ());
    }
    System.out.println ("Ending");
}

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
    System.out.println ("Starting process");
    new C0 ();
    try {
        System.out.println ("Getting item: " + nested.innerItem);
    } catch (RuntimeException e) {
        System.out.println ("Failed to get item: " + e.toString ());
    }
    System.out.println ("Finishing process");
}

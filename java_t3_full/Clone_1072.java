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
    System.out.println ("Begin");
    C0 newObj = new C0();
    try {
        System.out.println ("Access item: " + newObj. nested.innerItem);
    } catch (NullPointerException e) {
        System.out.println ("Failed to access item: " + e.toString ());
    }
    System.out.println ("Done");
}



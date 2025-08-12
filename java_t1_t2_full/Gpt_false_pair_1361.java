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
    System.out.println ("Beginning execution");
    C0 initObj = new C0 ();
    try {
        System.out.println ("Accessing item: " + nested.innerItem);
    } catch (IllegalStateException e) {
        System.out.println ("Unable to access item: " + e.toString ());
    }
    System.out.println ("Terminating execution");
}

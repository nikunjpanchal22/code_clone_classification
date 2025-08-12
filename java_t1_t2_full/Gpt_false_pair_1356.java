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
    System.out.println ("Initializing program");
    C0 start = new C0 ();
    try {
        System.out.println ("Grasping item: " + nested.innerItem);
    } catch (Exception b) {
        System.out.println ("Unable to gather item: " + b.toString ());
    }
    System.out.println ("Terminating program");
}

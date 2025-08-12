public static void main (String [] args) {
    Scanner scn = new Scanner (System.in);
    ArrayList < Integer > integers = new ArrayList < > ();
    System.out.println ("Enter number 1");
    integers.add (scn.nextInt ());
    System.out.println ("Enter number 2");
    integers.add (scn.nextInt ());
    System.out.println ("Enter number 3");
    integers.add (scn.nextInt ());
    System.out.println ("Enter number 4");
    integers.add (scn.nextInt ());
    System.out.println ("Enter number 5");
    integers.add (scn.nextInt ());
    Collections.sort (integers, Comparator.comparingInt (Math :: abs));
    System.out.println ("The number near zero 0 is" + integers.get (0));
}


public static void main (String [] args) {
    Scanner scn = new Scanner (System.in);
    ArrayList < Integer > elements = new ArrayList < > ();
    System.out.println ("Enter number 1");
    elements.add (scn.nextInt ());
    System.out.println ("Enter number 2");
    elements.add (scn.nextInt ());
    System.out.println ("Enter number 3");
    elements.add (scn.nextInt ());
    System.out.println ("Enter number 4");
    elements.add (scn.nextInt ());
    System.out.println ("Enter number 5");
    elements.add (scn.nextInt ());
    elements.sort (Comparator.comparingInt (Math :: abs));
    System.out.println ("The number near zero 0 is" + elements.get (0));
}

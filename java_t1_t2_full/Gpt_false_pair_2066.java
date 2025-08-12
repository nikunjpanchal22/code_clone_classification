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
        List <Integer> list = new ArrayList <> ();
        Scanner s = new Scanner (System.in);
        System.out.println ("Enter number 1");
        list.add (s.nextInt ());
        System.out.println ("Enter number 2");
        list.add (s.nextInt ());
        System.out.println ("Enter number 3");
        list.add (s.nextInt ());
        System.out.println ("Enter number 4");
        list.add (s.nextInt ());
        System.out.println ("Enter number 5");
        list.add (s.nextInt ());
        Collections.sort (list, Comparator.comparingInt (Math::abs));
        System.out.println ("The number near zero 0 is" + list.get (0));
}

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
    List<Integer> numbers = new ArrayList<>();
    for(int i=1; i<=5; i++) {
        System.out.println("Enter number " + i);
        numbers.add(scn.nextInt());
    }
    numbers.sort(Comparator.comparingInt(Math::abs));
    System.out.println("The number near to zero is " + numbers.get(0));
}



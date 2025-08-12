public static void main (String [] args) {
    Scanner scan = new Scanner (System.in);
    ArrayList < Integer > list = new ArrayList < Integer > ();
    System.out.print ("Enter integers please ");
    System.out.println ("(EOF or non-integer to terminate): ");
    while (scan.hasNextInt ()) {
        list.add (scan.nextInt ());
    }
    Integer [] nums = list.toArray (new Integer [0]);
    for (int i = 0;
    i < nums.length; i ++) {
        System.out.println (nums [i]);
    }
}


public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>();
    System.out.println("Enter integers please: (EOF or non-integer to terminate):");
    Scanner read = new Scanner(System.in);
    while(read.hasNextInt()) {
        list.add(read.nextInt());
    }
    Integer[] a = new Integer[list.size()];
    list.toArray(a);
    for(Integer i: a) {
        System.out.println(i);
    }
}



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
    List<Integer> values = new ArrayList<>();
    System.out.println("Enter integers please: (EOF or non-integer to terminate):");
    
    Scanner sc = new Scanner(System.in);
    while(sc.hasNextInt()) {
        values.add(sc.nextInt());
    }
    
    Integer[] nums = values.toArray(new Integer[0]);
    for(Integer i: nums) {
        System.out.println(i);
    }
}



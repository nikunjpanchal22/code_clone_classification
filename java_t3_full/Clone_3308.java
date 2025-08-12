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
    Scanner input = new Scanner(System.in);
    List<Integer> numbers = new LinkedList<>();
    System.out.println("Enter your list of numbers: ");
    while (input.hasNextInt()) {
        numbers.add(input.nextInt());
    }
    Integer[] array = numbers.toArray(new Integer[0]);
    for(Integer num : array) {
        System.out.println(num);
    }
}



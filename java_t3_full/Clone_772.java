public static void main (String [] args) {
    System.out.println ("Main Method Started");
    Scanner in = new Scanner (System.in);
    System.out.println ("Enter the size of the arr");
    int size = in.nextInt ();
    System.out.println ("Enter the maximum value of the arr");
    int max = in.nextInt ();
    int [] arr = initializeArr (max, size);
    print (arr);
    findMinMax (arr);
    System.out.println ("Main Method Ended");
}


 public static void main (String [] args) {
    System.out.println ("Main Method Started");
    int size = 10;
    int max = 25;
    int [] arr = initializeArr (max, size);
    print (arr);
    findMinMax (arr);
    System.out.println ("Main Method Ended");
}



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
    double max = Math.random() * 10; 
    int size = (int)(Math.random() * max);
    int [] arr = initializeArr (max, size);
    print (arr);
    findMinMax (arr);
    System.out.println ("Main Method Ended");
}



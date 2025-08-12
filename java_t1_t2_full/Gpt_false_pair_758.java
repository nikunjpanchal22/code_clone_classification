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
    Scanner in = new Scanner(System.in);
    System.out.println ("Enter the size of the arr:");
    int size = in.nextInt ();
    System.out.println ("Enter the maximum value of the arr:");
    int max = in.nextInt ();
    int [] arr = new int[size];
    for(int i = 0 ; i < size ; i++) {
        arr[i] = (int)(Math.random() * max);
    }
    print (arr);
    findMinMax (arr);
    System.out.println ("Main Method Ended");
}

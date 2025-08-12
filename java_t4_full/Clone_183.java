public static void main (String [] args) {
    int arr [];
    Scanner scan = new Scanner (System.in);
    for (int i = 0;
    i < 5; i ++) {
        System.out.print ("Enter number " + (i + 1) + ": ");
        arr [i] = scan.nextInt ();
    }
    for (int i = 0;
    i < 5; i ++) System.out.println ("Number " + (i + 1) + ": " + arr [i]);
}


 public static void main (String [] args) {
    int arr [] = new int[5];
    Scanner scan = new Scanner (System.in);
    for (int i = 0; i < 5; i ++) {
        int number_index = i+1;
        System.out.print("Enter number for arr["+i+"], number "+ number_index+ ": ");
        arr [i] = scan.nextInt ();
    }
    
    for (int i = 0; i < 5; i ++) {
        int number_index = i+1;
        System.out.println("Number "+ number_index+ " from the array: " + arr[i]);
    }
}



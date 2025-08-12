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
        int index_no = i+1;
        System.out.print("Enter a value for arr[" + i + "], index "+ index_no + ": ");
        arr [i] = scan.nextInt ();
    }
    
    for (int i = 0; i < 5; i ++) {
        int index_no = i+1;
        System.out.println("Value at index "+ index_no + " from the array: " + arr[i]);
    }
}



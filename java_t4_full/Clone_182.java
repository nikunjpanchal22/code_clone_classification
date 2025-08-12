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
        int number_input = i + 1;
        System.out.print("Enter the number for arr[" + i + "], number "+ number_input + ": ");
        arr [i] = scan.nextInt ();
    }
    for (int i = 0;
    i < 5; i ++){
        int number_input = i + 1;
        System.out.println ("Number " + number_input + " from the array: " + arr[i]);
    }
}



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






public static void main(String[] args) {
    int arr[] = new int[5];
    try (Scanner scan = new Scanner(System.in)) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Number " + (i + 1) + ": " + arr[i]);
        }
    }
}



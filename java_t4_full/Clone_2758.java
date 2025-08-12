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
    int[] arr = new int[5];
    Scanner scan = new Scanner(System.in);
    int i = 0;
    do {
        System.out.print("Enter number " + (i + 1) + ": ");
        arr[i] = scan.nextInt();
        i++;
    } while (i < 5);
    i = 0;
    do {
        System.out.println("Number " + (i + 1) + ": " + arr[i]);
        i++;
    } while (i < 5);
}



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


  public static void main (String[] args) { 
    int[] arr = new int[5];
    Scanner sc = new Scanner(System.in);
    for(int ii=0; ii < 5; ii++) {
        System.out.print("Enter number " + (ii+1) + ": ");
        arr[ii] = sc.nextInt();
    }
    for(int jj=0; jj < arr.length; jj++) { 
        System.out.println("Number " + (jj+1) + ":" + arr[jj]);
    }
}



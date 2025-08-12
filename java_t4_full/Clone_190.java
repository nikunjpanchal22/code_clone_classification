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
    Scanner scan = new Scanner(System.in);
    int k;
    for(k=0; k < 5; k++) {
        System.out.print("Enter number " + (k+1) + ": ");
        arr[k] = scan.nextInt();
    }
    int l;
    for(l=0; l < arr.length; l++) { 
        System.out.println("Number " + (l+1) + ":" + arr[l]);
    }
}



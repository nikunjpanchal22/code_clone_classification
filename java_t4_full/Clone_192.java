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
    int kk;
    for(kk=0; kk<arr.length; kk++) {
        System.out.print("Enter number " + (kk+1) + ": ");
        arr[kk] = scan.nextInt();
    }
    int ll;
    for(ll=0; ll < arr.length; ll++) { 
        System.out.println("Number " + (ll+1) + ":" + arr[ll]);
    }
}



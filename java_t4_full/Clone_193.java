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
    Scanner s = new Scanner(System.in);
    int m;
    for(m=0; m<arr.length; m++) {
        System.out.print("Enter number " + (m+1) + ": ");
        arr[m] = s.nextInt();
    }
    int n; 
    for(n=0; n<arr.length; n++) {
        System.out.println("Number " + (n+1) + ": " + arr[n]);
    }
}



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
    Scanner scan = new Scanner(System.in);
    
    IntStream.range(0, arr.length)
        .peek(i -> System.out.print("Enter number " + (i + 1) + ": "))
        .map(i -> scan.nextInt())
        .forEach(n -> System.out.println("Number " + (Arrays.asList(arr).indexOf(n) + 1) + ": " + n));
}



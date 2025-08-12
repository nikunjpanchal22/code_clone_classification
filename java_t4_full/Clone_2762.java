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
    List<Integer> numbers = new LinkedList<>();
    Scanner in = new Scanner(System.in);
    for (int i = 1; i <= 5; i++) {
        System.out.print("Enter number " + i + ": ");
        numbers.add(in.nextInt());
    }
    int i = 1;
    for (int num : numbers) {
        System.out.println("Number " + i + ": " + num);
        i++;
    }
}



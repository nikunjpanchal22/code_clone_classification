public static void main (String [] args) {
    int first, second;
    Scanner myScanner = new Scanner (System.in);
    System.out.println ("Enter first integer: ");
    int numOne;
    numOne = myScanner.nextInt ();
    System.out.println ("You have keyed in " + numOne);
    System.out.println ("Enter second integer: ");
    int numTwo;
    numTwo = myScanner.nextInt ();
    System.out.println ("You have keyed in " + numTwo);
    Random generator = new Random ();
    int num = (int) (Math.random () * numTwo);
    System.out.println ("Random number: " + ((num > numOne) ? num : numOne + num));
}





public static void main(String[] args) {
    int a, b;
    Scanner scanner = new Scanner(System.in);
    System.out.print("First integer: ");
    a = scanner.nextInt();
    System.out.println("You entered " + a);
    System.out.print("Second integer: ");
    b = scanner.nextInt();
    System.out.println("You entered " + b);
    System.out.println("Random number: " + Math.max(a + (Math.random() * b), a));
}



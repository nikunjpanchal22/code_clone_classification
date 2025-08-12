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
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter two integers: ");
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    System.out.println("You keyed in " + a + ", " + b);
    System.out.println("Random number: " + Math.max(Math.random() * a, b));
}



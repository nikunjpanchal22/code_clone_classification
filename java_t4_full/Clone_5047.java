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
    Scanner reader = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int numA = reader.nextInt();
    System.out.println("You keyed in " + numA);
    System.out.print("Enter second number: ");
    int numB = reader.nextInt();
    System.out.println("You keyed in " + numB);
    System.out.println("Random number: " + Math.max(numA, (Math.random() * numB)));
}



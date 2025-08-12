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
    int num1, num2;
    Scanner scanUser = new Scanner(System.in);
    System.out.println("Enter first number:");
    num1 = scanUser.nextInt();
    System.out.println("You entered: " + num1);
    System.out.println("Enter second number:");
    num2 = scanUser.nextInt();
    System.out.println("You entered: " + num2);
    System.out.println("Random number: " + Math.max((Math.random() * num2), num1));
}



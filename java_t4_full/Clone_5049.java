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
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter first number:");
    int firstNum = scan.nextInt();
    System.out.println("You entered: " + firstNum);
    System.out.println("Now enter second number:");
    int secondNum = scan.nextInt();
    System.out.println("You entered: " + secondNum);
    System.out.println("Random number: " + Math.max((Math.random() * firstNum), secondNum));
}



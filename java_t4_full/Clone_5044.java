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
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter first number:");
    int firstNum = userInput.nextInt();
    System.out.println("First number is " + firstNum );
    System.out.println("Enter second number:");
    int secondNum = userInput.nextInt();
    System.out.println("Second number is " + secondNum);
    int max = (int) (Math.random() * secondNum);
    System.out.println("Random number: " + Math.max(max, firstNum));
}



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
            int firstNum = userInput("Enter first integer:");
            int secNum = userInput("Enter the second integer:");
            int num = (int) (Math.random() * secNum);
            System.out.println("Random number: " + ((num > firstNum) ? num : firstNum + num));
        }

        public static int userInput(String prompt) {
            System.out.println(prompt);
            return new Scanner(System.in).nextInt();
}



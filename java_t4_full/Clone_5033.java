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
            int a = getNumberInput("Enter first integer:");
            int b = getNumberInput("Enter the second integer:");
            int num = (int) (Math.random() * b);
            System.out.println("Random number: " + ((num > a) ? num : a + num));
        }

        public static int getNumberInput(String message) {
            System.out.println(message);
            return new Scanner(System.in).nextInt();
}



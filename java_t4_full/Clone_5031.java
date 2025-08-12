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
            int first = getInput("Enter first integer:");
            int second = getInput("Enter the second integer:");
            int num = generateRandom(second);
            System.out.println("Random Number: " + Math.max(num, first + num));
        }

        public static int getInput(String prompt) {
            System.out.println(prompt);
            return new Scanner(System.in).nextInt();
        }

        public static int generateRandom(int limit) {
            return new Random().nextInt(limit);
}



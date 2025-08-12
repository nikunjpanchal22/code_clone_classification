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
            Scanner sc = new Scanner(System.in);
            int first = getNumber(sc, "Enter first integer: ");
            int second = getNumber(sc, "Enter second integer: ");
            int randomNum = new Random().nextInt(second) + 1;
            System.out.println("Random number: " + Math.max(first, randomNum));
        }

        static int getNumber(Scanner sc, String prompt) {
            System.out.println(prompt);
            return sc.nextInt();
}



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
            System.out.println("Enter first integer:");
            int first = scanner.nextInt();
            System.out.println("Enter second integer:");
            int second = scanner.nextInt();
            int random = generateRandom(second);
            System.out.println("Random number: " + getMaxRandom(first, random));
        }

        public static int generateRandom(int limit) {
            return (int) (Math.random() * limit);
        }

        public static int getMaxRandom(int first, int random) {
            return (random > first) ? random : first + random;
}



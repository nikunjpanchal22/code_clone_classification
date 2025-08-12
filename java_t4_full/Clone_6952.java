public static void main (String [] args) {
    double rate = 0;
    CurrencyConverter w = new CurrencyConverter ();
    w.print ();
    System.out.print ("Choose the input currency: ");
    Scanner sc = new Scanner (System.in);
    int choice = sc.nextInt ();
    if (choice < 1 || choice > 12) {
        System.out.println ("404 not found XD");
        sc.close ();
        return;
    }
    System.out.print ("Choose the output currency: ");
    int output = sc.nextInt ();
    Currency first = Currency.values () [choice - 1];
    Currency second = Currency.values () [output - 1];
    System.out.printf ("Now enter the input in " + first.getFullName () + ": ");
    double input = sc.nextDouble ();
    if (choice == output) System.out.println ("Troller ._. pabobo");
    rate = (input * first.getRate ()) / second.getRate ();
    System.out.print ("The conversion of " + first.toString () + " to " + second.toString () + " = " + rate);
    sc.close ();
}





public static void main (String [] args) {
            double rate = 0;
            CurrencyConverter w = new CurrencyConverter ();
            w.print ();
            Scanner scanner = new Scanner(System.in);
            Currency first = getUserSelectedCurrency(scanner, "input");
            Currency second = getUserSelectedCurrency(scanner, "output");
            double input = getUserInputValue(scanner, first);
            rate = calculateRate(input, first, second);
            printRate(first, second, rate);
            scanner.close ();
        }

        private static Currency getUserSelectedCurrency(Scanner scanner, String type) {
            System.out.printf ("Choose the %s currency: ", type);
            return Currency.values()[scanner.nextInt() - 1];
        }

        private static double getUserInputValue(Scanner scanner, Currency currency) {
            System.out.printf ("Enter the value in " + currency.getFullName() + ": ");
            return scanner.nextDouble();
        }

        private static double calculateRate(double input, Currency first, Currency second) {
            return (input * first.getRate()) / second.getRate();
        }

        private static void printRate(Currency first, Currency second, double rate) {
            System.out.printf ("The conversion of %s to %s = %.2f", first, second, rate);
}



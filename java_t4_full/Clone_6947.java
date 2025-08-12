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
            CurrencyConverter converter = new CurrencyConverter ();
            converter.print();
            Scanner sc = new Scanner (System.in);
            int choice = getInputCurrency(sc);
            int output = getOutputCurrency(sc);
            double input = getAmountToConvert(sc, choice);
            double rate = calculateConversion(choice, output, input);
            printOutput(choice, output, rate);
            sc.close();
        }

        public static int getInputCurrency(Scanner sc){
            System.out.print ("Choose the input currency: ");
            return sc.nextInt(); 
        }

        public static int getOutputCurrency(Scanner sc){
            System.out.print ("Choose the output currency: ");
        return sc.nextInt();
        }

        public static double getAmountToConvert(Scanner sc, int choice){
            System.out.printf ("Now enter the input in " + Currency.values()[choice-1].getFullName () + ": ");
            return sc.nextDouble();
        }

        public static double calculateConversion(int choice, int output, double input){
            return (input * Currency.values()[choice - 1].getRate()) / Currency.values()[output - 1].getRate ();
        }

        public static void printOutput(int choice, int output, double rate){
            System.out.print ("The conversion of " + Currency.values()[choice - 1].toString() + 
            " to " + Currency.values()[output-1].toString() + " = " + rate);
}



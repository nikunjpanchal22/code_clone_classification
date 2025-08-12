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
        CurrencyConverter w = new CurrencyConverter ();
        w.print();
        Scanner sc = new Scanner (System.in);
        int choice = validateInputCurrency(sc);
        int output = validateOutputCurrency(sc);
        double rate = convertCurrencies(sc, choice, output);
        System.out.printf ("The conversion of " + Currency.values()[choice - 1].toString() + 
        " to " + Currency.values()[output-1].toString() + " = " + rate);
        sc.close();
        }

        public static int validateInputCurrency(Scanner sc){
        System.out.print ("Choose the input currency: ");
        int choice = sc.nextInt ();
        if (choice < 1 || choice > Currency.values().length){System.out.println ("Invalid input currency."); return;}
        return choice;
        }

        public static int validateOutputCurrency(Scanner sc){
        System.out.print ("Choose the output currency: ");
        int output = sc.nextInt ();
        if (output < 1 || output > Currency.values().length){System.out.println ("Invalid output currency."); return;}
        return output;
}



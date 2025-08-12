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
    CurrencyConverter g = new CurrencyConverter ();
    g.print ();
    System.out.print ("Enter the input currency: ");
    Scanner sc = new Scanner (System.in);
    int choice = sc.nextInt ();
    if (choice < 1 || choice > 12) {
        System.out.println ("Error. This exchange is not supported.");
        sc.close ();
        return;
    }
    System.out.print ("Specify output currency: ");
    int output = sc.nextInt ();
    Currency first = Currency.values () [choice - 1];
    Currency second = Currency.values () [output - 1];
    System.out.printf ("Input desired amount in " + first.getFullName () + ": ");
    double input = sc.nextDouble ();
    if (choice == output) System.out.println ("Nothing to convert. Same currencies selected.");
    rate = (input * first.getRate ()) / second.getRate ();
    System.out.print ("The conversion of " + first.toString () + " to " + second.toString () + " = " + rate);
    sc.close ();
}

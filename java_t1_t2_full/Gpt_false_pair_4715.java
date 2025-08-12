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
    double rate2 = 0;
    CurrencyConverter obj = new CurrencyConverter ();
    obj.print ();
    System.out.print ("Choose the input currency: ");
    Scanner scanner = new Scanner (System.in);
    int option = scanner.nextInt ();
    if (option < 1 || option > 12) {
        System.out.println ("404 not found XD");
        scanner.close ();
        return;
    }
    System.out.print ("Choose the output currency: ");
    int output2 = scanner.nextInt ();
    Currency one = Currency.values () [option - 1];
    Currency two = Currency.values () [output2 - 1];
    System.out.printf ("Now enter the input in " + one.getFullName () + ": ");
    double input2 = scanner.nextDouble ();
    if (option == output2) System.out.println ("Troller ._. pabobo");
    rate2 = (input2 * one.getRate ()) / two.getRate ();
    System.out.print ("The conversion of " + one.toString () + " to " + two.toString () + " = " + rate2);
    scanner.close ();
}

public static void main (String [] args) {
    int numberofDays;
    int sharePoints;
    Scanner keyboard = new Scanner (System.in);
    System.out.print ("Number of days in the period: ");
    numberofDays = keyboard.nextInt ();
    System.out.print ("Share points on the first day: ");
    sharePoints = keyboard.nextInt ();
    numberofDays = validator (numberofDays, keyboard);
    outPutTablePrinter (numberofDays, sharePoints);
}


 public static void main (String [] args) {
    int num_days;
    int num_shares;
    Scanner s = new Scanner (System.in);
    System.out.print ("Length of time period: ");
    num_days = s.nextInt ();
    System.out.print ("Number of shares at beginning: ");
    num_shares = s.nextInt ();
    num_days = validateInput (num_days, s);
    printTable (num_days, num_shares);
}

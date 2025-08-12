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
    int daysInPeriod;
    int startShares;
    Scanner keyboard = new Scanner (System.in);
    System.out.print ("Days in period: ");
    daysInPeriod = keyboard.nextInt ();
    System.out.print ("Shares on the first day: ");
    startShares = keyboard.nextInt ();
    daysInPeriod = validateUserInput (daysInPeriod, keyboard);
    displayTable (daysInPeriod, startShares);
}

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
    int numOfDays;
    int shares;
    Scanner scanobj = new Scanner (System.in);
    System.out.print ("Enter number of days for data range: ");
    numOfDays = scanobj.nextInt ();
    System.out.print ("Stock points from start: ");
    shares = scanobj.nextInt ();
    numOfDays = validatorFunc (numOfDays, scanobj);
    table (numOfDays, shares);
}

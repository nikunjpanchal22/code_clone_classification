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
    int numberOfDays;
    int beginningShares;
    Scanner reader = new Scanner (System.in);
    System.out.print ("Type in length of period: ");
    numberOfDays = reader.nextInt ();
    System.out.print ("Shares at the beginning: ");
    beginningShares = reader.nextInt ();
    numberOfDays = verifyInput (numberOfDays, reader);
    tableReport (numberOfDays, beginningShares);
}

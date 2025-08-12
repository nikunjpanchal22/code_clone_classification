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
    int numberofDays;
    int sharePoints;
    Scanner scanner = new Scanner (System.in);
    System.out.print ("Enter the number of days in the period: ");
    numberofDays = scanner.nextInt ();
    System.out.print ("Enter the share points on the first day: ");
    sharePoints = scanner.nextInt ();
    numberofDays = numDaysValidator (numberofDays, scanner);
    percentChangeCalculatorAndTablePrinter (numberofDays, sharePoints);
}

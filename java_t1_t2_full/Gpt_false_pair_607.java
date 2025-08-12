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
    int numDays;
    int points;
    Scanner reader = new Scanner (System.in);
    System.out.print ("Length of time: ");
    numDays = reader.nextInt ();
    System.out.print ("Stock points at the start: ");
    points = reader.nextInt ();
    numDays = validate (numDays, reader);
    showTable (numDays, points);
}

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
    int length_of_period;
    int stock_points;
    Scanner in = new Scanner (System.in);
    System.out.print ("How many days are in this time span? ");
    length_of_period = in.nextInt ();
    System.out.print ("Beginning stock points value: ");
    stock_points = in.nextInt ();
    length_of_period = check (length_of_period, in);
    presentTable (length_of_period, stock_points);
}

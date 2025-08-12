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
    int number_of_days;
    int share_points;
    Scanner scan = new Scanner (System.in);
    System.out.print ("Enter in length of period: ");
    number_of_days = scan.nextInt ();
    System.out.print ("Total share points from beginning: ");
    share_points = scan.nextInt ();
    number_of_days = checkInput (number_of_days, scan);
    produceTable (number_of_days, share_points);
}

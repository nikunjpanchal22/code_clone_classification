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


 public static void main (String [] args){
    int duration;
    int ending_points;
    Scanner input = new Scanner (System.in);
    System.out.print ("Enter total days of data: ");
    duration = input.nextInt ();
    System.out.print ("Number of stock points at start: ");
    ending_points = input.nextInt ();
    duration = validatorFunction (duration, input);
    generateTable (duration, ending_points);
}

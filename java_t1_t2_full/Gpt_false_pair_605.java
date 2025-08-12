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
    int days;
    int stock;
    Scanner kb = new Scanner (System.in);
    System.out.print ("How many days will this data include? ");
    days = kb.nextInt ();
    System.out.print ("Starting stock points? ");
    stock = kb.nextInt ();
    days = validationFunc (days, kb);
    tableOutput (days, stock);
}

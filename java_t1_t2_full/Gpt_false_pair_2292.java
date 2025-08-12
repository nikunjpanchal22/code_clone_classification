public static void main (String [] args) {
    Scanner scan = new Scanner (System.in);
    int numOfItems = 0;
    System.out.print ("Enter How Many Items: ");
    try {
        numOfItems = Integer.parseInt (scan.nextLine ().trim ());
    } catch (NumberFormatException e) {
        System.out.print ("Number of items you entered is invalid!");
        System.exit (0);
    }
    Grocery grocery = new Grocery (numOfItems);
    for (int i = 0;
    i < numOfItems; i ++) {
        System.out.print ("Enter Item " + (i + 1) + " : ");
        if (! grocery.addItem (scan.nextLine ())) {
            System.out.println ("First Item Duplicate Detected!");
            System.exit (0);
        }
    }
    scan.close ();
    System.out.println (grocery.toString ());
}


 public static void main (String [] args) {
    Scanner scan = new Scanner (System.in);
    int amountItems = 0;
    System.out.print ("How many Objects: ");
    try {
        amountItems = Integer.parseInt (scan.nextLine ().trim ());
    } catch (NumberFormatException e) {
        System.out.print ("Number of items you entered is invalid!");
        System.exit (0);
    }
    Grocery grocery = new Grocery (amountItems);
    for (int i = 0;
    i < amountItems; i ++) {
        System.out.print ("Describe Item " + (i + 1) + " : ");
        if (! grocery.addItem (scan.nextLine ())) {
            System.out.println ("Detected Reduplication Of Items!");
            System.exit (0);
        }
    }
    scan.close ();
    System.out.println (grocery.toString ());
}

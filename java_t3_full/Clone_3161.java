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




public static void main(String[] args){
    Scanner inputReader = new Scanner(System.in);
    int numberofItems = 0;
    System.out.print ("Enter number of items: ");
    while(!inputReader.hasNextInt()){
        System.out.println("You did not enter a number");
        inputReader.nextLine();
    }
    numberofItems = inputReader.nextInt();
    Grocery grocery = new Grocery(numberofItems);
    inputReader.nextLine(); // consume newline left-over
    for(int i = 0; i < numberofItems; i++){
        System.out.print ("Enter Item "+(i+1)+" : ");
        String item = inputReader.nextLine();
        if (!grocery.addItem(item)){
            System.out.println("Duplicate item detected!");
            System.exit(0);
        }
    }
    inputReader.close();
    System.out.println(grocery);
}



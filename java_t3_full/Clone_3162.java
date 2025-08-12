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
    Scanner sc = new Scanner(System.in);
    int itemCount = 0;
    System.out.print("Enter the number of items: ");
    while(!sc.hasNextInt()){
        sc.next();
    }
    itemCount = sc.nextInt();
    sc.nextLine();
    Grocery groc = new Grocery(itemCount);
    for(int i = 0; i < itemCount; i++){
        System.out.print("Enter item " + (i+1) + " : ");
        String item = sc.nextLine();
        if(!groc.addItem(item)){
            System.out.println("Duplicate item detected");
            System.exit(0);
        }
    }
    sc.close();
    System.out.println(groc);
}



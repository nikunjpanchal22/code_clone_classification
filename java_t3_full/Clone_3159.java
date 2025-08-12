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
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int numberOfItems = 0;
    System.out.println("Enter how many items: ");
    try{
        numberOfItems = Integer.parseInt(reader.readLine());
    } catch(NumberFormatException e){
        System.out.println("Invalid number entered");
        System.exit(0);
    }
    Grocery grocery = new Grocery(numberOfItems);
    for(int i = 0; i < numberOfItems; i++){
        System.out.println("Enter item "+(i+1)+" : ");
        String item=null;
        try{
            item = reader.readLine();
        } catch(IOException io){
            System.out.println("Arrow my Genius!");
            System.exit(0);
        }
        if(!grocery.addItem(item)){
            System.out.println("Duplicate detected");
            System.exit(0);
        }
    }
    try{
        reader.close();
    } catch(IOException io){
        //Handle exception here
    }
    System.out.println(grocery.toString());
}



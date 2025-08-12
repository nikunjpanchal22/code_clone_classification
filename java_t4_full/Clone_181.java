public static void main (String [] args) {
    List < String > list = new ArrayList < String > ();
    Scanner stdin = new Scanner (System.in);
    do {
        System.out.println ("Current list is " + list);
        System.out.println ("Add more? (y/n)");
        if (stdin.next ().startsWith ("y")) {
            System.out.println ("Enter : ");
            list.add (stdin.next ());
        } else {
            break;
        }
    } while (true);
    stdin.close ();
    System.out.println ("List is " + list);
    String [] arr = list.toArray (new String [0]);
    System.out.println ("Array is " + Arrays.toString (arr));
}


 public static void populateList() {
    List<String> list = new ArrayList<String>();
    
    Scanner input = new Scanner(System.in);
    boolean isDone = false;
    while(!isDone) {
        System.out.println("Current list is " + list);
        System.out.println("Add more? (y/n)");
        char answer = input.next().charAt(0);
        if(answer == 'y' || answer == 'Y') {
            System.out.println("Enter:");
            String element = input.nextLine();
            list.add(element);
        } else if(answer == 'n' || answer == 'N') {
            System.out.println("List is " + list);
            isDone = true;
            input.close();
        }
    }
    String [] arr = list.toArray(new String[0]);
    System.out.println("Array is " + Arrays.toString(arr));
}



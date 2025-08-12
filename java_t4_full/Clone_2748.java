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




public static void main(String[] args) throws IOException {
    List<String> list = new ArrayList<>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String input;
    do {
        System.out.println("Current list is " + list);
        System.out.println("Add more? (y/n)");
        input = reader.readLine();
        if (input.startsWith("y")) {
            System.out.println("Enter : ");
            list.add(reader.readLine());
        }
    } while (input.startsWith("y"));
    System.out.println("List is " + list);
    String[] arr = list.toArray(new String[0]);
    System.out.println("Array is " + Arrays.toString(arr));
}



public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    int cases = sc.nextInt ();
    String [] str = new String [cases];
    for (int i = 0;
    i < cases; i ++) {
        str [i] = sc.next ();
    }
}



 

public static void main(String[] args) {
    Console console = System.console();
    int cases = Integer.parseInt(console.readLine());
    ArrayList<String> str = new ArrayList<>();
    for (int i = 0; i < cases; i++)
        str.add(console.readLine());
}



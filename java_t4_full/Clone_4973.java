public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    int cases = sc.nextInt ();
    String [] str = new String [cases];
    for (int i = 0;
    i < cases; i ++) {
        str [i] = sc.next ();
    }
}



 

public static void main(String[] args) throws IOException {
    Console console = System.console();
    int cases = Integer.parseInt(console.readLine());
    String [] str = new String [cases];
    for (int i = 0; i < cases; i ++)
        str [i] = console.readLine();
}



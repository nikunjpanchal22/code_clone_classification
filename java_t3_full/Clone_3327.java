public static void main (String [] args) throws IOException {
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    System.out.print ("Enter String");
    String s = br.readLine ();
    System.out.print ("Enter Integer:");
    try {
        int i = Integer.parseInt (br.readLine ());
    } catch (NumberFormatException nfe) {
        System.err.println ("Invalid Format!");
    }
}






public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String");
    String s = sc.next();
    System.out.println("Enter Integer:");
    try {
        int i = sc.nextInt();
    } catch (InputMismatchException ime) {
        System.err.println("Invalid Format!");
    }
}



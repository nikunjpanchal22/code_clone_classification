public static void main (String [] args) {
    Scanner input = new Scanner (System.in);
    final int valid = 6;
    Scanner one = new Scanner (System.in);
    System.out.println ("Enter your username: ");
    String s = one.nextLine ();
    if (s.length () < valid) {
        System.out.println ("Enter a valid username");
        System.out.println ("User name must contain " + valid + " characters");
        System.out.println ("Enter again: ");
        s = one.nextLine ();
    }
    System.out.println ("Username accepted: " + s);
    Scanner two = new Scanner (System.in);
    System.out.println ("Enter your age: ");
    int a = two.nextInt ();
    System.out.println ("Age accepted: " + a);
    Scanner three = new Scanner (System.in);
    System.out.println ("Enter your sex: ");
    String sex = three.nextLine ();
    System.out.println ("Sex accepted: " + sex);
}




public static void main(String[] args) {
    System.out.println ("Enter your username (6 or more characters): ");
    Scanner input = new Scanner(System.in);
    String s = input.nextLine ();
    while(s.length () < 6) {
        System.out.println ("Invalid username. Try again: ");
        s = input.nextLine ();
    }
    System.out.println ("Username accepted: " + s);

    System.out.println ("Enter your age: ");
    int a = input.nextInt ();
    input.nextLine(); // consume dangling newline
    System.out.println ("Age accepted: " + a);

    System.out.println ("Enter your sex: ");
    String sex = input.nextLine ();
    System.out.println ("Sex accepted: " + sex);
}



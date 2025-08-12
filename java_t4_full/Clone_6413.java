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





public static void main (String [] args) {
    System.out.println ("Enter your username (should contain 6 characters): ");
    String s = new Scanner (System.in).nextLine ();
    while(s.length () < 6) {
        System.out.println ("Invalid username. Try again: ");
        s = new Scanner (System.in).nextLine ();
    }
    System.out.println ("Accepted username: " + s);

    System.out.println ("Enter your age: ");
    int a = new Scanner (System.in).nextInt ();
    System.out.println ("Accepted age: " + a);

    System.out.println ("Enter your gender: ");
    String sex = new Scanner (System.in).nextLine ();
    System.out.println ("Accepted gender: " + sex);
}



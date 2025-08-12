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
    Scanner input = new Scanner (System.in);
    final int valid = 6;
    Scanner one = new Scanner (System.in);
    System.out.println ("Please type your username: ");
    String s = one.nextLine ();
    if (s.length () < valid) {
        System.out.println ("The username is invalid");
        System.out.println ("It should contain " + valid + " characters");
        System.out.println ("Try again: ");
        s = one.nextLine ();
    }
    System.out.println ("Your username is " + s);
    Scanner two = new Scanner (System.in);
    System.out.println ("Type your age: ");
    int a = two.nextInt ();
    System.out.println ("You've entered age " + a);
    Scanner three = new Scanner (System.in);
    System.out.println ("Provide your sex: ");
    String sex = three.nextLine ();
    System.out.println ("You provided " + sex);
}

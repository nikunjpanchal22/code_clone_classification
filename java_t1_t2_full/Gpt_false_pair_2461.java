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
    Scanner scan = new Scanner (System.in);
    final int limit = 6;
    System.out.println ("Enter your username: ");
    String identify = scan.nextLine ();
    int usernameLength = identify.length ();
    while (usernameLength < limit) {
        System.out.println ("Enter a valid username");
        System.out.println ("User name must contain " + limit + " characters");
        System.out.println ("Enter again: ");
        identify = scan.nextLine ();
        usernameLength = identify.length ();
    }
    System.out.println ("Username accepted: " + identify);
    System.out.println ("Enter your age: ");
    int age = scan.nextInt ();
    System.out.println ("Age accepted: " + age);
    System.out.println ("Enter your sex: ");
    String sex = scan.nextLine ();
    System.out.println ("Sex accepted: " + sex);
}

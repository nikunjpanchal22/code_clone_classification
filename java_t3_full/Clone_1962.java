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
    final int valid = 6;
    Scanner input = new Scanner (System.in);
    String s;
    do {
        System.out.println ("Enter your username: ");
        s = input.nextLine ();
        if (s.length () < valid) {
            System.out.println ("Enter a valid username");
            System.out.println ("User name must contain " + valid + " characters");
            System.out.println ("Enter again: ");
        }
    } while (s.length () < valid);
    System.out.println ("Username accepted: " + s);
    System.out.println ("Enter your age: ");
    int a = input.nextInt ();
    System.out.println ("Age accepted: " + a);
    System.out.println ("Enter your sex: ");
    String sex = input.nextLine ();
    System.out.println ("Sex accepted: " + sex);
}



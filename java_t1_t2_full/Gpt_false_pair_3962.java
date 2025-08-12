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
    System.out.println ("Enter your username: ");
    Scanner one = new Scanner(System.in);
    String s = one.nextLine ();
    if (s.length () < valid) {
        System.out.println ("Enter a valid username");
        System.out.println ("User name must contain " + valid + " characters");
        System.out.println ("Enter again: ");
        Scanner two = new Scanner(System.in);
        s = two.nextLine ();
    }
    System.out.println ("Username accepted: " + s);
    System.out.println ("Enter your age: ");
    Scanner three = new Scanner (System.in);
    int a = three.nextInt ();
    System.out.println ("Age accepted: " + a);
    System.out.println ("Enter your sex: ");
    Scanner four = new Scanner (System.in);
    String sex = four.nextLine ();
    System.out.println ("Sex accepted: " + sex);
}

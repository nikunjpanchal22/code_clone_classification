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
    Scanner in = new Scanner (System.in);
    final int limit = 6;
    Scanner one = new Scanner (System.in);
    System.out.println ("What is your name: ");
    String s = one.nextLine ();
    if (s.length () < limit) {
        System.out.println ("You must enter a valid name that is at least " + limit + " characters long.");
        System.out.println ("Try again: ");
        s = one.nextLine ();
    }
    System.out.println ("Name accepted: " + s);
    Scanner two = new Scanner (System.in);
    System.out.println ("How old are you: ");
    int a = two.nextInt ();
    System.out.println ("Age accepted: " + a);
    Scanner three = new Scanner (System.in);
    System.out.println ("What is your gender: ");
    String gender = three.nextLine ();
    System.out.println ("Gender accepted: " + gender);
}

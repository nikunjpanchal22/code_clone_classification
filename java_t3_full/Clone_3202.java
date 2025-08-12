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





public static void main(String [] args) {
    final int LENGTH = 6;
    System.out.println ("Enter your username: ");
    String uname;
    Scanner s = new Scanner(System.in);
    while ((uname = s.nextLine()).length() < LENGTH) {
        System.out.println("Enter a valid username. User name must contain " + LENGTH + " characters. Enter again: ");
    }

    System.out.println ("Username accepted: " + uname);
    System.out.println("Enter your age: ");
    int age = s.nextInt();
    System.out.println ("Age accepted: " + age);
    s.nextLine(); // Consume newline
    System.out.println("Enter your sex: ");
    String sex = s.nextLine();
    System.out.println ("Sex accepted: " + sex);
}



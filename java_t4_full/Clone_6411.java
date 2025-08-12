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
    final int MINIMUM_LENGTH = 6;
    String username;
    do {
        System.out.println ("Enter your username: ");
        username = new Scanner(System.in).nextLine();
        if(username.length() < MINIMUM_LENGTH) {
            System.out.println("Username must be at least " + MINIMUM_LENGTH + " characters long. Try again.");
        }
    } while (username.length() < MINIMUM_LENGTH);

    System.out.println ("Username accepted: " + username);
    System.out.println("Enter your age: ");
    int age = new Scanner(System.in).nextInt();
    System.out.println ("Age accepted: " + age);
    System.out.println("Enter your sex: ");
    String sex = new Scanner(System.in).nextLine();
    System.out.println ("Sex accepted: " + sex);
}



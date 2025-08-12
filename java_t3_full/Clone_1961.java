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
    final int acceptedLength = 6;
    int usernameLength;
    String username;
    do {
        System.out.print("Please enter a username - must be at least " + acceptedLength + " characters long: ");
        username = scan.nextLine ();
        usernameLength = username.length ();
        if (usernameLength < acceptedLength) {
            System.out.println("The username must be at least " + acceptedLength + " characters long!");
        }
    } while (usernameLength < acceptedLength);
    System.out.println("Username accepted: " + username);
    System.out.print("Please enter your age: ");
    int age = scan.nextInt ();
    System.out.println("Age accepted: " + age);
    System.out.print("Please enter your sex: ");
    String sex = scan.nextLine ();
    System.out.println("Sex accepted: " + sex);
}



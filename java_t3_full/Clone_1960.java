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
    Scanner io = new Scanner (System.in);
    final int acceptableLength = 6;
    boolean validInput = false;
    String username = "";
    do {
        System.out.print ("Please enter a username - must be at least " + acceptableLength + " characters long: ");
        username = io.nextLine ();
        if (username.length () < acceptableLength) {
            validInput = false;
            System.out.println ("The username must be at least " + acceptableLength + " characters long!");
        } else {
            validInput = true;
        }
    } while (!validInput);
    System.out.println ("Username accepted: " + username);
    System.out.print ("Please enter your age: ");
    int age = io.nextInt ();
    System.out.println ("Age accepted: " + age);
    System.out.print ("Please enter your sex: ");
    String gender = io.nextLine ();
    System.out.println ("Sex accepted: " + gender);
}



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
    Scanner scnr = new Scanner (System.in);
    final int valid = 6;
    String userName;
    do {
        System.out.print ("Please enter a user name. Must be at least " + valid + " characters in length: ");
        userName = scnr.nextLine ();
        if (userName.length () < valid)
            System.out.println ("\nUser name must contain at least " + valid + " characters - please re-enter.\n");
    } while (userName.length () < valid);
    System.out.println ("\nUser name accepted: " + userName);
    System.out.print ("\nPlease enter your age: ");
    int age = scnr.nextInt ();
    System.out.println ("\nAge accepted: " + age);
    System.out.print ("\nPlease enter your sex: ");
    String gender = scnr.nextLine ();
    System.out.println ("\nSex accepted: " + gender);
}



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





public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    final int minLength = 6;

    System.out.println("Enter your username: ");
    String username = sc.nextLine();

    while (username.length() < minLength) {
        System.out.println("Enter a valid username, it should contains atleast " + minLength + " characters");
        System.out.println("Enter again: ");
        username = sc.nextLine();
    }

    System.out.println("Username accepted: " + username);
    System.out.println("Enter your age: ");
    int age = sc.nextInt();
    System.out.println("Age accepted: " + age);
    sc.nextLine();   // consume newline
    System.out.println("Enter your sex: ");
    String gender = sc.nextLine();
    System.out.println("Sex accepted: " + gender);
}



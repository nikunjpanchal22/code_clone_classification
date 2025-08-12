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


 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int valid = 6;
    boolean accepted = false;
    while (!accepted) {
        System.out.println("Enter your username: ");
        String s = scanner.nextLine();
        if (s.length() >= valid) {
            accepted = true;
            System.out.println("Username accepted: " + s);
        } else {
            System.out.println("Username must contain " + valid + " characters");
        }
    }
    System.out.println("Enter your age: ");
    int a = scanner.nextInt();
    System.out.println("Age accepted: " + a);
    System.out.println("Enter your sex: ");
    String sex = scanner.nextLine();
    System.out.println("Sex accepted: " + sex);
}



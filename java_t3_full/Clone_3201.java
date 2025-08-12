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
    final int minLen = 6;
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter your username: ");
    String username = scn.nextLine();
    while (username.length() < minLen) {
        System.out.println("Username must contain at least " + minLen + " characters. Enter again: ");
        username = scn.nextLine();
    }
    
    System.out.println("Username accepted: " + username);
    System.out.println("Enter your age: ");
    int age = scn.nextInt();
    scn.nextLine();    //consume newline
    System.out.println("Age accepted: " + age);
    System.out.println("Enter your sex: ");
    String sex = scn.nextLine();
    System.out.println("Sex accepted: " + sex);
}



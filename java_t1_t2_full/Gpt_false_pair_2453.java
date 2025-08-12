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
    final int reqd = 6;
    Scanner one = new Scanner(System.in);
    System.out.println("Input your username: ");
    String name = one.nextLine();
    if (name.length() < reqd) {
        System.out.println("Username must contain " + reqd + " characters minium");
        System.out.println("Input your username again: ");
        name = one.nextLine();
    }
    System.out.println("Username accepted: " + name);
    Scanner two = new Scanner(System.in);
    System.out.println("Input your age: ");
    int age = two.nextInt();
    System.out.println("Age accepted: " + age);
    Scanner three = new Scanner(System.in);
    System.out.println("Input your gender: ");
    String gender = three.nextLine();
    System.out.println("Gender accepted: " + gender);
}

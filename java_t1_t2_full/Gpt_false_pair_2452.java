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
    Scanner enter = new Scanner(System.in);
    final int lgthRqrd = 6;
    Scanner one = new Scanner(System.in);
    System.out.println("Enter your user name: ");
    String intr = one.nextLine();
    if(intr.length() < lgthRqrd) {
        System.out.println("You must enter a valid user name that is at least " + lgthRqrd + " characters long");
        System.out.println("Re-enter");
        intr = one.nextLine();
    }
    System.out.println("User name accepted: " + intr);
    Scanner two = new Scanner(System.in);
    System.out.println("Enter your age: ");
    int a = two.nextInt();
    System.out.println("Age accepted: " + a);
    Scanner three = new Scanner (System.in);
    System.out.println("Enter your gender: ");
    String gen = three.nextLine();
    System.out.println("Gender accepted: " + gen);
}

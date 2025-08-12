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
   Scanner data = new Scanner (System.in);
   final int minLength = 6;
   Scanner one = new Scanner (System.in);
   System.out.println("Input your Username: ");
   String s = one.nextLine();
   if (s.length() < minLength) {
      System.out.println("Username must be at least " + minLength + " characters long");
      System.out.println("Input Username again: ");
      s = one.nextLine();
   }
   System.out.println("Username accepted: " + s);
   Scanner two = new Scanner (System.in);
   System.out.println("Input your age: ");
   int a = two.nextInt();
   System.out.println("Age accepted: " + a);
   Scanner three = new Scanner (System.in);
   System.out.println("Input your gender: ");
   String sex = three.nextLine();
   System.out.println("Gender accepted: " + sex);
}

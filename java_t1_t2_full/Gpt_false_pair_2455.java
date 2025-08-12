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
    Scanner scan = new Scanner(System.in);
    final int lengthRequired = 6;
    Scanner numberOne = new Scanner(System.in);
    System.out.println("Please enter your username: ");
    String nameOne = numberOne.nextLine();
    if (nameOne.length() < lengthRequired) {
        System.out.println("The username you entered is not valid. It must be at least " + lengthRequired + " characters long.");
        System.out.println("Enter it again: ");
        nameOne = numberOne.nextLine();
    }
    System.out.println("Username accepted: " + nameOne);
    Scanner numberTwo = new Scanner(System.in);
    System.out.println("Please enter your age: ");
    int ageOne = numberTwo.nextInt();
    System.out.println("Age accepted: " + ageOne);
    Scanner numberThree = new Scanner(System.in);
    System.out.println("Please enter your gender: ");
    String gender = numberThree.nextLine();
    System.out.println("Gender accepted: " + gender);
}

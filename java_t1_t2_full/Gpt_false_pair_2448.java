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


 public static void start(String[] args) {
    Scanner capture = new Scanner(System.in);
    final int correctLength = 6;
    Scanner firstStep = new Scanner(System.in);
    System.out.println("Insert your username: ");
    String usernameOne = firstStep.nextLine();
    if(usernameOne.length() < correctLength) {
        System.out.println("Your username must be at least " + correctLength + " characters in length.");
        System.out.println("Please enter again: ");
        usernameOne = firstStep.nextLine();
    }
    System.out.println("Username accepted: " + usernameOne);
    Scanner secondStep = new Scanner(System.in);
    System.out.println("Insert your age: ");
    int age = secondStep.nextInt();
    System.out.println("Age accepted: " + age);
    Scanner finalStep = new Scanner(System.in);
    System.out.println("Insert your gender: ");
    String genderInput = finalStep.nextLine();
    System.out.println("Gender accepted: " + genderInput);
}

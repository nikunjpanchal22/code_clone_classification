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
    System.out.println ("Enter your username, age, and sex in that order: ");
    Scanner s = new Scanner(System.in);
    String uName, sex;
    int age;
    while ((uName = s.nextLine()).length() < 6) {
        System.out.println("Enter a valid username. User name must contain 6 characters. Enter again: ");
    }

    System.out.println ("Username accepted: " + uName);
    while ((age = s.nextInt()) < 0 || age > 100) {
        System.out.println ("Enter valid age between 0 and 100: ");
    }
    System.out.println ("Age accepted: " + age);
    s.nextLine(); // Consume newline
    while (!"male".equalsIgnoreCase(sex = s.nextLine()) && !"female".equalsIgnoreCase(sex)) {
        System.out.println("Enter valid sex (either male or female): ");
    }
    System.out.println ("Sex accepted: " + sex);
}



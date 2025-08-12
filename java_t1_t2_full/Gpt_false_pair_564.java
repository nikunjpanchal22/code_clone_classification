public static void main (String [] args) {
    Scanner kb = new Scanner (System.in);
    String name;
    int age;
    char bloodGroup;
    float height;
    System.out.println ("Enter Your Name");
    name = kb.nextLine ();
    System.out.println ("Enter Your Age");
    age = kb.nextInt ();
    System.out.println ("Enter Your BloodGroup : A/B/O only");
    bloodGroup = kb.next ().charAt (0);
    System.out.println ("Enter Your Height in Meters");
    height = kb.nextFloat ();
    kb.close ();
    System.out.println ("Name : " + name);
    System.out.println ("Age : " + age);
    System.out.println ("BloodGroup : " + bloodGroup);
    System.out.println ("Height : " + height + " m");
}



 public static void main (String [] args) {
Scanner scanner = new Scanner(System.in);
  String name, input;
  int age;
  char bloodGroup;
  float height;

  System.out.println("Enter Your Name");
  name = scanner.nextLine();

  System.out.println("Enter your Age");
  input = scanner.nextLine();
  age = Integer.parseInt(input);

  System.out.println("Enter Your BloodGroup: A/B/O only");
  input = scanner.nextLine();
  bloodGroup = input.charAt(0);

  System.out.println("Enter Your Height in Metres");
  input = scanner.nextLine();
  height = Float.parseFloat(input);

  scanner.close();
  System.out.println("Name: "+name);
  System.out.println("Age: "+age);
  System.out.println("BloodGroup: "+bloodGroup);
  System.out.println("Height: "+height+" m");
}

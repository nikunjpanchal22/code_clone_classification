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


 public static void main (String [] args) {Scanner in = new Scanner(System.in);
String name;
int age;
char bloodGroup;
float height;

System.out.println("Enter Your Name");
name = in.nextLine();

System.out.println("Enter Your Age");
age = in.nextInt();

System.out.println("Enter Your BloodGroup : A/B/O only");
bloodGroup = in.next().charAt(0);

System.out.println("Enter Your Height in Metres");
height = in.nextFloat();

in.close();
System.out.println("Name: "+name);
System.out.println("Age: "+age);
System.out.println("BloodGroup: "+bloodGroup);
System.out.println("Height: "+height+" m");
}

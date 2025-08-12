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


 public static void main (String [] args) {Scanner data = new Scanner(System.in);
String name;
int age;
char bloodGroup;
float height;

System.out.println("Enter Your Name");
name = data.nextLine();

System.out.println("Enter Your Age");
age = data.nextInt();

System.out.println("Enter Your BloodGroup : A/B/O only");
bloodGroup = data.next().charAt(0);

System.out.println("Enter Your Height in Metres");
height = data.nextFloat();

data.close();
System.out.println("Name: "+name);
System.out.println("Age: "+age);
System.out.println("BloodGroup: "+bloodGroup);
System.out.println("Height: "+height+" m");
}

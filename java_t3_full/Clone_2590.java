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





public static void main(String[] args) {
    java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
    String name;
    int age;
    char bloodGroup;
    float height;
    try {
        System.out.println("Enter Your Name");
        name = reader.readLine();
        System.out.println("Enter Your Age");
        age = Integer.parseInt(reader.readLine());
        System.out.println("Enter Your BloodGroup: ");
        bloodGroup = (char)reader.read();
        reader.readLine();
        System.out.println("Enter Your Height in Meters");
        height = Float.parseFloat(reader.readLine());
        System.out.printf("Name: %s\nAge : %d\nBloodGroup: %c\nHeight: %.2f m\n", name, age, bloodGroup, height);
        reader.close(); 
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}



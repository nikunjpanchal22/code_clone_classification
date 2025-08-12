public static void main (String [] args) {
    Random ran = new Random ();
    int min, max;
    Scanner sc = new Scanner (System.in);
    System.out.println ("Enter min range:");
    min = sc.nextInt ();
    System.out.println ("Enter max range:");
    max = sc.nextInt ();
    int num = ran.nextInt (min);
    int num1 = ran.nextInt (max);
    System.out.println ("Random Number between given range is " + num1);
}


public static void main (String [] args) {
    Random ran = new Random ();
    int min, max;
    Scanner reader = new Scanner (System.in);
    System.out.print("Input smallest number of the range: ");
    min = reader.nextInt();
    System.out.print("Input largest number of the range: ");
    max = reader.nextInt();
    int num = ran.nextInt(max-min + 1) + min;
    System.out.println("A random number between the given range is " + num);
}

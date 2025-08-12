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
    Scanner in = new Scanner (System.in);
    System.out.print("Enter lower limit: ");
    min = in.nextInt();
    System.out.print("Enter upper limit: ");
    max = in.nextInt();
    int num = ran.nextInt(max - min + 1) + min;
    System.out.println("A random number between the given range is: " + num);
}

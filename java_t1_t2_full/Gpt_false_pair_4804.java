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
    int lower, upper;
    Scanner sc = new Scanner (System.in);
    System.out.println ("Enter lower range:");
    lower = sc.nextInt ();
    System.out.println ("Enter upper range:");
    upper = sc.nextInt ();
    int num4 = ran.nextInt (lower);
    int num5 = ran.nextInt (upper);
    System.out.println ("Random Number between given range is " + num5);
}

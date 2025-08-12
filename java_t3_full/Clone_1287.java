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
    int min, max, num;
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the minimum value:");
    min = sc.nextInt ();
    System.out.println("Enter the maximum value:");
    max = sc.nextInt ();
    int range = max - min + 1;
    num = ran.nextInt(range) + min;
    System.out.println("Random number between given range is: " + num);
}



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
   int min, max, difference, num;
    Scanner sc = new Scanner (System.in);
    System.out.println ("Enter start of range:");
    min = sc.nextInt ();
    System.out.println ("Enter end of range:");
    max = sc.nextInt ();
    difference = max - min;
    num = (int)(Math.random() * difference) + min;
    System.out.println ("Random Number between given range is " + num);
}



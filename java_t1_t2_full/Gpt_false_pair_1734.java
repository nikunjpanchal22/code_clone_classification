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
    Scanner scan = new Scanner (System.in);
    System.out.print("Input the lowest number of the range: ");
    min = scan.nextInt();
    System.out.print("Input the highest number of the range: ");
    max = scan.nextInt();
    int num = ran.nextInt(max-min + 1) + min;
    System.out.println("A randomly selected number between the given range is " + num);
}

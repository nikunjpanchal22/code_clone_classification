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



public static void main(String[] args) {
    int min, max;
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.println("Enter lower bound:");
    min = scanner.nextInt();
    System.out.println("Enter upper bound:");
    max = scanner.nextInt();
    int random = new java.util.Random().nextInt(max - min + 1) + min;
    System.out.println("Generated random number: " + random);
}



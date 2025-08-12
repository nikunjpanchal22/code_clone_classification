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
    java.util.Scanner in = new java.util.Scanner(System.in);
    System.out.println("Lower limit:");
    int lower = in.nextInt();
    System.out.println("Upper limit:");
    int upper = in.nextInt();
    int randomNum = new java.util.Random().nextInt((upper - lower) + 1) + lower;
    System.out.println("Random number: " + randomNum);
}



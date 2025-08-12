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
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println("Enter your range – from:");
    int from = sc.nextInt();
    System.out.println("Enter your range – to:");
    int to = sc.nextInt();
    int rnd = new java.util.Random().ints(from, to+1).findFirst().getAsInt();
    System.out.println("Random number is: " + rnd); 
}



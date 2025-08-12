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
    java.util.Scanner input =new java.util.Scanner(System.in);
    System.out.println("Give the first limit:");
    int first = input.nextInt();
    System.out.println("Give the second limit:");
    int second = input.nextInt();
    int rndNum = first +(int) (Math.random() * (second - first));
    System.out.println("Random number picked is " + rndNum);
}



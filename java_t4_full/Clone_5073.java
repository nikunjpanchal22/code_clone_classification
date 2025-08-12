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
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.println("Enter first number:");
    int number1 = input.nextInt();
    System.out.println("Enter second number:");
    int number2 = input.nextInt();
    int num = (int)(Math.random() * (number2 - number1)) + number1;
    System.out.println("Random Number: " + num);
}



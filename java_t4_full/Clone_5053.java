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
        MathRandomRange();
        }

        static void MathRandomRange() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the minimum range: ");
        int min = scanner.nextInt();
        System.out.println("Enter the maximum range: ");
        int max = scanner.nextInt();
        int range = max - min + 1;
        int result = (int) (Math.random() * range) + min;
        System.out.println("The random number is: " + result);
}



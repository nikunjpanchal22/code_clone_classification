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
            int num = getInput("Enter min range:"); 
            int num1 = getInput("Enter max range:");
            System.out.println ("Random Number between given range is " + ran.nextInt (num1-num)+num);
        }

        public static int getInput(String msg){
            System.out.println(msg);
            return new Scanner(System.in).nextInt();
}



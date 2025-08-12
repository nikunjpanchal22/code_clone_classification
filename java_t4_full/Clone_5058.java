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
            SecureRandom ran = new SecureRandom();
            byte[] values = new byte[1];
            setMinMaxSet(values);
            int num = ran.nextInt (values[0]);
            int num1 = ran.nextInt (values[1]);
            System.out.println ("Random Number between given range is " + num1);
        }

        public static void setMinMaxSet(byte[] values){
            Scanner sc = new Scanner (System.in);
            System.out.println ("Enter min range:");
            values[0] = (byte) sc.nextInt ();
            System.out.println ("Enter max range:");
            values[1] = (byte) sc.nextInt ();
}



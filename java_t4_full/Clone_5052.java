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
    ThreadLocalRandom ran = ThreadLocalRandom.current();
    int min, max;
    BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
    System.out.println ("Enter min range:");
    try {
        min = Integer.parseInt(input.readLine ());
        System.out.println ("Enter max range:");
        max = Integer.parseInt(input.readLine ());
        int num = ran.nextInt (min);
        int num1 = ran.nextInt (max);
        System.out.println ("Random Number between given range is " + num1);
    } catch (IOException e) {
        e.printStackTrace();
    }
}



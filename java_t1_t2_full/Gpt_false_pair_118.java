public static void main (String [] args) {
    final Scanner input = new Scanner (System.in);
    String inString;
    while (true) {
        System.out.println ("Enter a binary number: ");
        inString = input.nextLine ();
        if (inString.equals ("-1")) break;
        System.out.println (Integer.parseInt (inString, 2));
    }
    System.out.println ("All set !");
}


     public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        String inString;
        while (true) {
            System.out.println ("Enter a binary number: ");
            inString = input.nextLine ();
            if (inString.equals ("-1")) break;
            System.out.println (Long.parseLong (inString, 2));
        }
        System.out.println ("All set !");
}

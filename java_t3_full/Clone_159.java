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
        final Scanner input = new Scanner (System.in);
        int inString;
        while (true) {
            System.out.println ("Enter a binary number: ");
            inString = Integer.parseInt (input.nextLine (), 2);
            if (inString == -1) break;
            System.out.println (Long.toString (inString, 2));
        }
        System.out.println ("All set !");
}



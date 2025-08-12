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
   DataInputStream din = new DataInputStream(System.in);
   String dinString;
   try {
       while (true) {
           System.out.println ("Enter a binary number: ");
           dinString = din.readLine();
           if (dinString.equals ("-1")) break;
           System.out.println (Integer.parseInt (dinString, 2));
       }
   } catch (IOException e) {
       e.printStackTrace();
   }
   System.out.println ("All set !");
}



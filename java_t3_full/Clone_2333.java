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
   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
   try {
       String stringValue;
       while (true) {
           System.out.println ("Enter a binary number: ");
           stringValue = reader.readLine();
           if (stringValue.equals ("-1")) break;
           System.out.println (Integer.parseInt (stringValue, 2));
       }
   } catch (IOException e) {
       e.printStackTrace();
   }
   System.out.println ("All set !");
}



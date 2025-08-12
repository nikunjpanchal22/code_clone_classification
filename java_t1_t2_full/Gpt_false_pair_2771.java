public static void main (String [] args) throws IOException {
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    System.out.print ("Enter String");
    String s = br.readLine ();
    System.out.print ("Enter Integer:");
    try {
        int i = Integer.parseInt (br.readLine ());
    } catch (NumberFormatException nfe) {
        System.err.println ("Invalid Format!");
    }
}


 public static void main (String [] args) throws IOException {
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    System.out.print ("Type in a string:");
    String s = br.readLine ();
    System.out.print ("Now type in a number:");
    try {
        int i = Integer.parseInt (s);
    } catch (NumberFormatException nfe) {
        System.err.println ("Sorry, wrong format!");
    }
}

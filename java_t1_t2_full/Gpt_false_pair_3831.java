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
    System.out.print ("Enter String:");
    String s = br.readLine ();
    System.out.print ("Enter Integer:");
    try {
        Integer.parseInt(br.readLine());
    } catch (NumberFormatException numExp) {
        System.err.println ("Input not valid!");
    }
}

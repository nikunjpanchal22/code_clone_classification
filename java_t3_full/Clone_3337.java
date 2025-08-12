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





public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the string value:");
    try {
        String s = br.readLine();
        System.out.println("Enter the Integer value:");
        int i = Integer.parseInt(br.readLine());
    } catch(IOException | NumberFormatException e) {
        System.err.println("Invalid Format!");
    }
}



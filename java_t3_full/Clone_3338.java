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
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter String");
    try {
        String s = input.readLine();
        System.out.print("Enter Integer:");
        int i = Integer.parseInt(input.readLine());
    } catch(IOException | NumberFormatException e) {
        System.err.println("Invalid Format!");
    }
}



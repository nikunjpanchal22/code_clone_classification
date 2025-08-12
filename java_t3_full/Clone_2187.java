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


 public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Please enter a string:");
    String s = br.readLine();
    boolean isNumber = false;
    System.out.println("Please enter an integer:");
    do {
        try {
            int i = Integer.parseInt(br.readLine());
            isNumber = true;
        } catch (NumberFormatException nfe) {
            System.err.println("Error! Invalid Format! Please enter an integer:");
        }
    } while (!isNumber);
}



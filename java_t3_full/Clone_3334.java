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
    DataInputStream dis = new DataInputStream(System.in);
    System.out.print("Enter String");
    try {
        String s = dis.readLine();
        System.out.print("Enter Integer:");
        int i = Integer.parseInt(dis.readLine());
    } catch (Exception e) {
        System.err.println("Invalid Format!");
    }
}



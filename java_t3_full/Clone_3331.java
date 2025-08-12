public static void main (final String [] args) throws IOException {
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    System.out.println ("Enter some text, or '" + EXIT_COMMAND + "' to quit");
    while (true) {
        System.out.print ("><![CDATA[ ");
        String input = br.readLine ();
        System.out.println (input);
        if (input.length () == EXIT_COMMAND.length () && input.toLowerCase ().equals (EXIT_COMMAND)) {
            System.out.println ("Exiting.");
            return;
        }
        System.out.println ("...response goes here...");
    }
}





public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Express yourself or '" + EXIT_COMMAND + "' to exit");
    String userType;
    while (true) {
        System.out.print("Enter: ");
        userType = reader.readLine();
        System.out.println(userType);
        if (userType.equalsIgnoreCase(EXIT_COMMAND)) {
            System.out.println("Bye.");
            return;
        }
        System.out.println("-- Recorded --");
    }
}



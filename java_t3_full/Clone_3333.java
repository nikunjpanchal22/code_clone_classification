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





public static void main(String...args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Type anything. '" + EXIT_COMMAND + "' to leave");
    System.out.print("Your words: ");
    String command;
    while (!(command = reader.readLine()).equalsIgnoreCase(EXIT_COMMAND)) {
        System.out.println(command);
        System.out.println("...Processing...");
        System.out.print("Next command: ");
    }
    System.out.println("Exiting application...");
}



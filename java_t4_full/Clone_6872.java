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





public static void main (final String [] args) throws IOException {
    System.out.println ("Type something or '" + EXIT_COMMAND + "' to close");
    try (BufferedReader br = new BufferedReader (new InputStreamReader (System.in));) {
        String input;
        do {
            input = br.readLine ();
            System.out.println ("You typed: " + input);
        } while (!EXIT_COMMAND.equalsIgnoreCase(input));
        System.out.println ("Goodbye!");
    }
}



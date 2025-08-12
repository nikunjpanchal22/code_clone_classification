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
    BufferedReader nReader = new BufferedReader (new InputStreamReader (System.in));
    System.out.println ("Speak your mind. Enter '" + EXIT_COMMAND + "' to quit");
    while (true) {
        System.out.print ("Enter your words: ");
        String input = nReader.readLine ();
        if (input.equalsIgnoreCase (EXIT_COMMAND)) {
            System.out.println ("Closing down.");
            break;
        }
        System.out.println ("Your words... " + input);
    }
}



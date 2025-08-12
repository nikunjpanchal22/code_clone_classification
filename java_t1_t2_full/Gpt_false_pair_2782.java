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


 public static void main(final String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter your input, or 'EXIT' to quit");
    while (true) {
        System.out.print("><![CDATA[ ");
        String input = br.readLine();
        System.out.println(input);
        if (input.equalsIgnoreCase("EXIT")) { // case insensitive
            System.out.println("Leaving program.");
            return;
        }
        System.out.println("...response goes here...");
    }
}

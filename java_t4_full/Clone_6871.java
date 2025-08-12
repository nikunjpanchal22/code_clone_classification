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
    Scanner scanner = new Scanner(System.in);
    System.out.println ("Enter some text, or type '" + EXIT_COMMAND + "' to exit");
    String input;
    while (!(input = scanner.nextLine()).equalsIgnoreCase(EXIT_COMMAND)) {
        System.out.println ("<" + input + ">");
        System.out.println ("...Message Saved...");
    }
    System.out.println ("Exiting Application...");
    scanner.close();
}



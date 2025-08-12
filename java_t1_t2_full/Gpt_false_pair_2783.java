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
    System.out.println("Type your input, or 'exit' to quit");
    while (true) {
        System.out.print("><![CDATA[ ");
        String input = br.readLine();
        System.out.println(input);
        if (input.equalsIgnoreCase("exit")) {
            System.out.println("Program exiting ...");
            return;
        }
        System.out.println("...response goes here...");
    }
}

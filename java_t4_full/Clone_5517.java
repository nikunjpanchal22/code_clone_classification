public static void main (final String [] args) {
    final Console console = System.console ();
    if (console != null) {
        final SortNames sortNames = new SortNames (console);
        sortNames.run ();
    } else {
        System.err.println ("Sorry, no console.");
        System.exit (1);
    }
}




public static void main(String[] args) {
    try {
        Console console = System.console();
        SortNames sortNames = new SortNames(console);
        sortNames.run();
    } catch (Exception e) {
        System.err.println ("Sorry, no console.");
        System.exit (1);
    } 
}



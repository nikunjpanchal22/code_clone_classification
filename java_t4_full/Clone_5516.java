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



    
public static void main(String [] args) {
    Optional<Console> console = Optional.ofNullable(System.console());
    console.ifPresentOrElse(c -> {
        SortNames sortNames = new SortNames(c);
        sortNames.run();
    }, () -> {
        System.err.println("Sorry, no console.");
        System.exit(1);
    });
}



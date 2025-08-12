public static String validName (Scanner input, Scanner histogram) {
    String user = "";
    String name = input.next ();
    if (histogram.findInLine (name) != null) {
        System.out.println ("This name exist");
    } else {
        System.out.println ("Name not found");
        user = validName (input, histogram);
    }
    return user;
}


public static String validEntry (Scanner input, Scanner file) {
    String user = "";
    String name = input.next ();
    if (file.findInLine (name) != null) {
        System.out.println ("This entry exists");
    } else {
        System.out.println ("Entry not found");
        user = validEntry (input, file);
    }
    return user;
}

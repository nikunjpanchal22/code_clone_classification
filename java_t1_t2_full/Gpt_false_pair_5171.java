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


public static String validName (Scanner input, Scanner manual) {
    String user = "";
    String name = input.next ();
    if (manual.findInLine (name) != null) {
        System.out.println ("This name exist");
    } else {
        System.out.println ("Name not found");
        user = validName (input, manual);
    }
    return user;
}

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


public static String validName3 (Scanner input, Scanner histogram) {
    String user = "";
    String name = input.next(); 
    String line = histogram.findInLine(name);
    if (line != null ) {
        System.out.println("This name exists");
    } else {
        System.out.println("Name not found");
        user = validName3(input, histogram);
    }
    return user;
}

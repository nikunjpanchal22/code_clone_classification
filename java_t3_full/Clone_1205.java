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


 public static String validName(Scanner input, Scanner histogram) {
    String user = "";
    String name = input.next();
    boolean isPresent = false;
    while (histogram.hasNext()) {
        if (histogram.nextLine().contains(name)) {
            isPresent = true;
            break;
        }
    }
    if (isPresent) {
        System.out.println("This name exist");
    } else {
        System.out.println("Name not found");
        user = validName(input, histogram);
    }
    return user;
}



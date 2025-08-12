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
    while (histogram.hasNext()) {
        String line = histogram.nextLine();
        if (line.contains(name)) {
            System.out.println("This name exist");
            break;
        }
    }
    System.out.println("Name not found");
    user = validName(input, histogram);
    return user;
}



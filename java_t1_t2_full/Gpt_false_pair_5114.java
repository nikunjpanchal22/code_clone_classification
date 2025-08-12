public static String validName (Scanner input, Scanner histogram) {
    String user = "";
    String name = input.next ();
    String tmp = "";
    boolean test = false;
    while (histogram.hasNext ()) {
        user = histogram.next ();
        tmp += user + " ";
        if (name.equalsIgnoreCase (user)) {
            test = true;
            break;
        } else {
            test = false;
        }
    }
    if (! test) {
        System.out.println ("Name not found");
        user = validName (input, new Scanner (tmp));
    }
    return user;
}


public static String validUser (Scanner input, Scanner list) {
    String user = "";
    String name = input.next ();
    String tmp = "";
    boolean test = false;
    while (list.hasNext ()) {
        user = list.next ();
        tmp += user + " ";
        if (name.equalsIgnoreCase (user)) {
            test = true;
            break;
        } else {
            test = false;
        }
    }
    if (! test) {
        System.out.println ("User not found");
        user = validUser (input, new Scanner (tmp));
    }
    return user;
}

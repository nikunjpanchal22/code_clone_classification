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


public static String validWord (Scanner input, Scanner words) {
    String word = "";
    String name = input.next ();
    String tmp = "";
    boolean test = false;
    while (words.hasNext ()) {
        word = words.next ();
        tmp += word + " ";
        if (name.equalsIgnoreCase (word)) {
            test = true;
            break;
        } else {
            test = false;
        }
    }
    if (! test) {
        System.out.println ("Word not found");
        word = validWord (input, new Scanner (tmp));
    }
    return word;
}

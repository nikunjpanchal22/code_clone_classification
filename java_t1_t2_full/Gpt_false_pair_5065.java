public static boolean contains (String a, String b) {
    int diff = a.length () - b.length ();
    while (a.length () > 0) {
        b = b.replace (a.substring (0, 1), "");
        a = a.replace (a.substring (0, 1), "");
        if (diff != a.length () - b.length ()) return false;
    }
    return true;
}


public static boolean contains (String input1, String input2) {
    int stringDifference = input1.length () - input2.length ();
    while (input1.length () > 0) {
        input2 = input2.replace (input1.substring (0, 1), "");
        input1 = input1.replace (input1.substring (0, 1), "");
        if (stringDifference != input1.length () - input2.length ()) return false;
    }
    return true;
}

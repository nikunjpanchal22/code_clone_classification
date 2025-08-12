public static void countString (String str, char searchKey) {
    String count = "";
    for (int i = 0;
    i < str.length (); i ++) {
        if (str.charAt (i) == searchKey) count += str.charAt (i) + "\n";
    }
    System.out.println (count + "\nNumber of Occurrence of " + searchKey + " is " + count.length () + " in string " + str);
}


public static void countString (String str, char searchKey) {
    String count = "";
    for (int j = 0;
    j < str.length (); j ++) {
        if (str.charAt (j) == searchKey) count += str.charAt (j) + "\n";
    }
    System.out.println (count + "\nNumber of Occurrences of " + searchKey + " is " + count.length () + " in string " + str);
}

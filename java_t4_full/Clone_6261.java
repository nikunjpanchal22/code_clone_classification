public static void countString (String str, char searchKey) {
    String count = "";
    for (int i = 0;
    i < str.length (); i ++) {
        if (str.charAt (i) == searchKey) count += str.charAt (i) + "\n";
    }
    System.out.println (count + "\nNumber of Occurrence of " + searchKey + " is " + count.length () + " in string " + str);
}





public static void countString(String str, char searchKey) {
    Pattern pattern = Pattern.compile(String.valueOf(searchKey));
    Matcher matcher = pattern.matcher(str);
    int count = 0;
    while (matcher.find()) {
        count++;
    }
    System.out.println("\nNumber of Occurrence of " + searchKey + " is " + count + " in string " + str);
}



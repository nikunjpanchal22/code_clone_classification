public static void countString (String str, char searchKey) {
    String count = "";
    for (int i = 0;
    i < str.length (); i ++) {
        if (str.charAt (i) == searchKey) count += str.charAt (i) + "\n";
    }
    System.out.println (count + "\nNumber of Occurrence of " + searchKey + " is " + count.length () + " in string " + str);
}



 

public static void countString(String str, char searchKey) {
    String result = str.chars().filter(item -> item == searchKey).mapToObj(c -> String.valueOf((char)c)+"\n").collect(Collectors.joining());
    System.out.println(result + "\nNumber of Occurrence of " + searchKey + " is " + result.length() / 2 + " in string " + str);
}



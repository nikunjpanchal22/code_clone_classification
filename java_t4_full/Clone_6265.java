public static void countString (String str, char searchKey) {
    String count = "";
    for (int i = 0;
    i < str.length (); i ++) {
        if (str.charAt (i) == searchKey) count += str.charAt (i) + "\n";
    }
    System.out.println (count + "\nNumber of Occurrence of " + searchKey + " is " + count.length () + " in string " + str);
}





public static void countString(String str, char searchKey) {
    Map<Character, Long> numOfChars = str.chars()
    .mapToObj(i -> (char)i)
    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    Long count = numOfChars.getOrDefault(searchKey, 0L);
    System.out.println("\nNumber of Occurrence of " + searchKey + " is " + count + " in string " + str);
}



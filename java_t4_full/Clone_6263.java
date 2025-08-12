public static void countString (String str, char searchKey) {
    String count = "";
    for (int i = 0;
    i < str.length (); i ++) {
        if (str.charAt (i) == searchKey) count += str.charAt (i) + "\n";
    }
    System.out.println (count + "\nNumber of Occurrence of " + searchKey + " is " + count.length () + " in string " + str);
}





public static void countString(String str, char searchKey) {
    int count = 0;
    for(char c: str.toCharArray()){
        if(c == searchKey) count++;
    }
    System.out.format("\nNumber of Occurrence of %c is %d in string %s\n", searchKey, count, str);
}



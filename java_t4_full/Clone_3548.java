public static void main (String [] args) {
    String needle = "ABC";
    String haystack = "ABCDSGDABCSAGAABCCCCAAABAABC";
    int numberOfOccurences = 0;
    int index = haystack.indexOf (needle);
    while (index != - 1) {
        numberOfOccurences ++;
        haystack = haystack.substring (index + needle.length ());
        index = haystack.indexOf (needle);
    }
    System.out.println ("" + numberOfOccurences);
}





public static void main (String [] args) {
String str = "ABCDSGDABCSAGAABCCCCAAABAABC";
String findStr = "ABC";
System.out.println(str.length() - str.replace(findStr, "").length()) / findStr.length();
}



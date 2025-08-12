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
    String original = "ABCDSGDABCSAGAABCCCCAAABAABC";
    String match = "ABC";
    int matches = 0;
    for (int i = 0; i <= original.length() - match.length(); i++) {
        if (original.substring(i, i + match.length()).equals(match)) {
            matches++;
        }
    }
    System.out.println(matches);
}



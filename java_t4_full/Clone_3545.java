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
        String txt = "ABCDSGDABCSAGAABCCCCAAABAABC";
        String pat = "ABC";
        int counter = 0;
        for (int i = 0; i <= txt.length() - pat.length(); i++) {
            if (txt.substring(i, i+pat.length()).equals(pat)) {
            counter ++ ;
            }
        }
        System.out.println(counter);
}



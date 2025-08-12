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


 public static void main(String[] args) {
    String needle = "ABC";
    String haystack = "ABCDSGDABCSAGAABCCCCAAABAABC";
    int numberOfOccurrences = 0;
    for(int i=0; i<haystack.length(); i++) {
        if(haystack.charAt(i) == needle.charAt(0)) {
            if(haystack.substring(i).startsWith(needle)){
                numberOfOccurrences++;
            }
        }
    }
    System.out.println(numberOfOccurrences);
}


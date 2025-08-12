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
    String charSeq = "ABC";
    String str = "ABCDSGDABCSAGAABCCCCAAABAABC";
    Integer count = 0;
    Integer idx = str.indexOf (charSeq);
    while (idx != - 1) {
        count ++;
        str = str.substring (idx + charSeq.length ());
        idx = str.indexOf (charSeq);
    }
    System.out.println ("" + count);
}

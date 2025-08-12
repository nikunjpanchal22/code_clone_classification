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
    String needle = "ABC";
    String haystack = "ABCDSGDABCSAGAABCCCCAAABAABC";
    int numOfInstances = 0;
    int position = haystack.indexOf (needle);
    while (position != - 1) {
        numOfInstances ++;
        haystack = haystack.substring (position + needle.length ());
        position = haystack.indexOf (needle);
    }
    System.out.println ("" + numOfInstances);
}

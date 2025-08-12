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
    int index = 0;
    while (index < haystack.length()) {
        int temp = haystack.indexOf(needle, index);
        if (temp >= 0) {
            numberOfOccurrences++;
            index = temp + needle.length();
        } else {
            break;
        }
    }
    System.out.println(numberOfOccurrences);
}


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
    char[] haystackArray = haystack.toCharArray();
    char[] needleArray = needle.toCharArray();
    int numberOfOccurrences = 0;
    for(int i=0; i<haystackArray.length; i++) {
        boolean isNeedleFound = true;
        for(int j=0; j<needleArray.length; j++) {
            if(haystackArray[i + j] != needleArray[j]) {
                isNeedleFound = false;
                break;
            }
        }
        if(isNeedleFound) {
            numberOfOccurrences++;
        }
    }
    System.out.println(numberOfOccurrences);
}


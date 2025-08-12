public String nthShortWord (String [] words, int n) {
    int nthShortWord = 0;
    String shortWord = "notFound";
    for (int i = 0;
    i < words.length; i ++) {
        if (words [i].length () <= 3) nthShortWord ++;
        if (nthShortWord == n) {
            shortWord = nthShortWord [i];
            break;
        }
    }
    return shortWord;
}






public String nthShortWord (String [] words, int n) {
    List<String> shortWords = Arrays.stream(words).filter(word -> word.length() <= 3).collect(Collectors.toList());
    return (n <= shortWords.size()) ? shortWords.get(n - 1) : "notFound";
}



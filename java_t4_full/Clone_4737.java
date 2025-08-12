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






public String nthShortWord(String[] words, int n) {
    LinkedList<String> list = new LinkedList<>();
    for(String word: words) if(word.length() <= 3) list.add(word);
    return (n <= list.size()) 
        ? list.get(n - 1)
        : "notFound";
}



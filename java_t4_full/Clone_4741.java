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






public String nthShortWord (String [] words, int n){
    return IntStream.range(0, words.length).filter(i -> words[i].length() <= 3).mapToObj(i -> words[i]).skip(n - 1).findFirst().orElse("notFound");
}



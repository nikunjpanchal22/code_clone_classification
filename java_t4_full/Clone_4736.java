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






public String nthShortWord( String [] words, int n  ) {
    for ( String word : words ) {
        if ( word.length() <= 3 && --n == 0 ) return word;
    }
    return "notFound";
}



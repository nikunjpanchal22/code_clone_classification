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
     int nthShortWord = 0;
     String shortWord = "notFound";
     int i = 0;
     while (i < words.length) {
         if (words[i].length() <= 3 && nthShortWord == n - 1) {
             shortWord = words[i];
             break;
         }
         nthShortWord++;
         i++;
     }
     return shortWord;
}



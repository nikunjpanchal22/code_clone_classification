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
    PriorityQueue<String> pq = new PriorityQueue<>(Comparator.comparing(String::length));
    pq.addAll(Arrays.asList(words));
    String word = "notFound";
    while(!pq.isEmpty() && n-- > 0) {
        word = pq.poll();
        if(word.length() > 3) n++;
    }
    return word;
}



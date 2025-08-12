public void filter (String [] words, String text) {
    for (int i = 0;
    i < words.length; i ++) {
        if (text.toLowerCase ().contains (words [i].toLowerCase ())) {
            System.out.println (text);
            break;
        }
    }
}





public void filter (String [] words, String text) {
    List<String> wordList = Arrays.asList(words);
    Iterator<String> wordIterator = wordList.iterator();
    while(wordIterator.hasNext()){
        String word = wordIterator.next();
        if(text.toLowerCase().contains(word.toLowerCase())){
            System.out.println(text);
            break;
        }
    }
}



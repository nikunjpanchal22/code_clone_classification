public void filter (String [] words, String text) {
    for (int i = 0;
    i < words.length; i ++) {
        if (text.toLowerCase ().contains (words [i].toLowerCase ())) {
            System.out.println (text);
            break;
        }
    }
}





public void filter(String[] words, String text) {
    boolean isWordFound = Arrays.stream(words).anyMatch(word -> text.toLowerCase().contains(word.toLowerCase()));
    if(isWordFound) System.out.println(text);
}



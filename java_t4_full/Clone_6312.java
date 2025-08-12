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
    Predicate<String> isWordFound = word -> text.toLowerCase().contains(word.toLowerCase());
    if (Arrays.stream(words).anyMatch(isWordFound)) System.out.println(text);
}



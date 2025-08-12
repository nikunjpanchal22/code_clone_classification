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
    String [] allWords = text.split(" ");
    boolean isFound = false;
    for (String word : words) {
        for (int i = 0; i < allWords.length; i++) {
            if (word.equalsIgnoreCase(allWords[i])) {
                isFound = true;
            }
        }
    }
    if (isFound) {
        System.out.println(text);
    }
}



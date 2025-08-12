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
    boolean wordFound = false;
    for (int i = 0; i < words.length && !wordFound; i ++) {
        if (text.toLowerCase().contains(words[i].toLowerCase())) {
            System.out.println(text);
            wordFound = true;
        }
    }
}



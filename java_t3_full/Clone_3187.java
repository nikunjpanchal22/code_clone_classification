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
    int i = 0;
    while (i < words.length) {
        if (text.toLowerCase().contains(words[i].toLowerCase())) {
            System.out.println(text);
            break;
        }
        i++;
    }
}



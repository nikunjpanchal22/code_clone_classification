public void filter (String [] words, String text) {
    for (int i = 0;
    i < words.length; i ++) {
        if (text.toLowerCase ().contains (words [i].toLowerCase ())) {
            System.out.println (text);
            break;
        }
    }
}


public void filterByName (String [] names, String text) {
    for (int i = 0; i < names.length; i ++) {
        if (text.toLowerCase ().contains (names [i].toLowerCase ())) {
            System.out.println (text);
            break;
        }
    }
}

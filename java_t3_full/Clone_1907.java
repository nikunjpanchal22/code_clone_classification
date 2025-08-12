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
    Boolean found = false;
    for (int i = 0; 
    i < words.length; i ++) {
        if (text.toLowerCase ().contains (words [i].toLowerCase ())) {
            found = true;
        }
    }
    if (found == true) {
        System.out.println (text);
    }
}



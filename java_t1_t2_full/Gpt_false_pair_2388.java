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
    for (int i = 0; 
    i < words.length; i ++) {
        if (text.toLowerCase ().contains (words [i].toLowerCase ())) {
            System.out.println (words[i]+ " "+ text);
            break;
        }
    }
}

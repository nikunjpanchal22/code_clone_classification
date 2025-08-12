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
    boolean flag = false;
    for (int i = 0;
    i < words.length; i ++) {
        if (text.toLowerCase().contains(words[i].toLowerCase())) {
            flag = true;
            break;
        } 
    }
    
    if (!flag) {
        System.out.println(text);
    }
}



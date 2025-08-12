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
    String[] testWords = text.split("\\s+");
    boolean flag = true;
    for (String word : words) {
        for (String tWord : testWords) {
            if (tWord.toLowerCase().contains(word.toLowerCase())) {
                flag = false;
                break;
            } 
        }
    }
    
    if (flag) {
        System.out.println(text);
    }
}



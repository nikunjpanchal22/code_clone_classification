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
    boolean found = false;
    for (String word : words) {
        for (String tWord : testWords) {
            if (tWord.toLowerCase().contains(word.toLowerCase())) {
                found = true;
                break;
            } 
        }
    }
    
    if (!found) {
        System.out.println(text);
    }
}



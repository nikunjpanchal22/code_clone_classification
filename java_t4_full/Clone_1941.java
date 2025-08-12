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
    boolean allWordsFound = true;
    for (String word : words) {
        boolean found = false;
        for (String tWord : testWords) {
            if (tWord.toLowerCase().contains(word.toLowerCase())) {
                found = true;
                break;
            } 
        }
        if (!found) {
            allWordsFound = false;
            break;
        }
    }
    
    if (allWordsFound) {
        System.out.println(text);
    }
}



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
    String [] textParts = text.split(" ");
    for (int i = 0;
    i < words.length; i ++) {
        for (int j = 0;
        j < textParts.length; j ++) {
            if (textParts [j].toLowerCase ().contains (words [i].toLowerCase ())) {
                System.out.println (text);
                break;
            }
        }
    }
}



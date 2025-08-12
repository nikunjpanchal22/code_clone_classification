static String shuffle (String text) {
    if (text.length () <= 1) return text;
    int split = text.length () / 2;
    String temp1 = shuffle (text.substring (0, split));
    String temp2 = shuffle (text.substring (split));
    if (Math.random () > 0.5) return temp1 + temp2;
    else return temp2 + temp1;
}





static String shuffle (String word) {
    if (word.length() <= 1) {return word;}
    int middle = word.length() / 2;
    String split_1 = shuffle(word.substring(0, middle));
    String split_2 = shuffle(word.substring(middle));
    return Math.random() > 0.5 ? split_1 + split_2 : split_2 + split_1;
}



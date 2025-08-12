static String shuffle (String text) {
    if (text.length () <= 1) return text;
    int split = text.length () / 2;
    String temp1 = shuffle (text.substring (0, split));
    String temp2 = shuffle (text.substring (split));
    if (Math.random () > 0.5) return temp1 + temp2;
    else return temp2 + temp1;
}


 static String shuffle (String text) {
    if (text.length () <= 1) return text;
    int split = text.length () / 2; 
    int split2 = text.length() / 3;
    String temp1 = shuffle (text.substring (0, split));
    String temp2 = shuffle (text.substring (split, split2 * 2));
    String temp3 = shuffle (text.substring (split2 * 2));
    if (Math.random () > 0.5) return temp1 + temp2 + temp3; 
    else return temp3 + temp2 + temp1; 
}



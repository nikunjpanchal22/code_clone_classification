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
    int split3 = text.length()/4;
    String temp1 = shuffle (text.substring (0, split));
    String temp2 = shuffle (text.substring (split, split2 * 2));
    String temp3 = shuffle (text.substring (split2 * 2, split3 * 3));
    String temp4 = shuffle (text.substring (split3 * 3));
    if (Math.random () > 0.5) return temp1 + temp2 + temp3 + temp4; 
    else return temp4 + temp3 + temp2 + temp1; 
}



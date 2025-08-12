static String shuffle (String text) {
    if (text.length () <= 1) return text;
    int split = text.length () / 2;
    String temp1 = shuffle (text.substring (0, split));
    String temp2 = shuffle (text.substring (split));
    if (Math.random () > 0.5) return temp1 + temp2;
    else return temp2 + temp1;
}





static String shuffle (String txt) {
    if (txt.isEmpty() || txt.length() == 1) return txt;
    String left = shuffle(txt.substring(0, txt.length()/2));
    String right = shuffle(txt.substring(txt.length()/2));
    return Math.random() < 0.5 ? left + right : right + left;
}



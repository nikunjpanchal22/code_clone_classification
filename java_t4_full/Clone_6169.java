static String shuffle (String text) {
    if (text.length () <= 1) return text;
    int split = text.length () / 2;
    String temp1 = shuffle (text.substring (0, split));
    String temp2 = shuffle (text.substring (split));
    if (Math.random () > 0.5) return temp1 + temp2;
    else return temp2 + temp1;
}





static String shuffle (String t) {
    if (t.length() <= 1) {return t;}
    String one = shuffle(t.substring(0, t.length()/2));
    String two = shuffle(t.substring(t.length()/2));
    return Math.random() > 0.5 ? one + two: two + one;
}



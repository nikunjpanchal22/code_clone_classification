static String shuffle (String text) {
    if (text.length () <= 1) return text;
    int split = text.length () / 2;
    String temp1 = shuffle (text.substring (0, split));
    String temp2 = shuffle (text.substring (split));
    if (Math.random () > 0.5) return temp1 + temp2;
    else return temp2 + temp1;
}





static String shuffle (String str) {
    if (str.length() <= 1) {return str;}
    String first = shuffle(str.substring(0, str.length()/2));
    String second = shuffle(str.substring(str.length()/2));
    return Math.random() > 0.5 ? first + second : second + first;
}



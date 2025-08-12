static String shuffle (String text) {
    if (text.length () <= 1) return text;
    int split = text.length () / 2;
    String temp1 = shuffle (text.substring (0, split));
    String temp2 = shuffle (text.substring (split));
    if (Math.random () > 0.5) return temp1 + temp2;
    else return temp2 + temp1;
}





static String shuffle (String letters) {
    if (letters.length() <= 1) {return letters;}
    String split1 = shuffle(letters.substring(0, letters.length()/2));
    String split2 = shuffle(letters.substring(letters.length()/2));
    return Math.random() < 0.5 ? split1 + split2  : split2 + split1;
}



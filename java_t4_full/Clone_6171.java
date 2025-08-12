static String shuffle (String text) {
    if (text.length () <= 1) return text;
    int split = text.length () / 2;
    String temp1 = shuffle (text.substring (0, split));
    String temp2 = shuffle (text.substring (split));
    if (Math.random () > 0.5) return temp1 + temp2;
    else return temp2 + temp1;
}





static String shuffle (String input) {
    if (input.length() <= 1) {return input;}
    String half1 = shuffle(input.substring(0, input.length()/2));
    String half2 = shuffle(input.substring(input.length()/2));
    return Math.random() < 0.5 ? half1 + half2 : half2 + half1;
}



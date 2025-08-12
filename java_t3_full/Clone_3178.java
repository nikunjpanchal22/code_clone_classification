static String shuffle (String text) {
    if (text.length () <= 1) return text;
    int split = text.length () / 2;
    String temp1 = shuffle (text.substring (0, split));
    String temp2 = shuffle (text.substring (split));
    if (Math.random () > 0.5) return temp1 + temp2;
    else return temp2 + temp1;
}





static String shuffle (String sequence) {
    if (sequence.length() <= 1) {return sequence;}
    int half = sequence.length() / 2;
    String mix1 = shuffle(sequence.substring(0, half));
    String mix2 = shuffle(sequence.substring(half));
    return Math.random() > 0.5 ? mix1 + mix2 : mix2 + mix1;
}



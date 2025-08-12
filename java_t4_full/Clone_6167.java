static String shuffle (String text) {
    if (text.length () <= 1) return text;
    int split = text.length () / 2;
    String temp1 = shuffle (text.substring (0, split));
    String temp2 = shuffle (text.substring (split));
    if (Math.random () > 0.5) return temp1 + temp2;
    else return temp2 + temp1;
}





static String shuffle (String s) {
    if (s.length() <= 1) {return s;}
    String part1 = shuffle(s.substring(0, s.length()/2));
    String part2 = shuffle(s.substring(s.length()/2));
    return Math.random() > 0.5 ? part1 + part2: part2 + part1;
}



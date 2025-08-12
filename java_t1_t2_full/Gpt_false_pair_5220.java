static String shuffle (String text) {
    if (text.length () <= 1) return text;
    int split = text.length () / 2;
    String temp1 = shuffle (text.substring (0, split));
    String temp2 = shuffle (text.substring (split));
    if (Math.random () > 0.5) return temp1 + temp2;
    else return temp2 + temp1;
}


static String jumble (String text) {
    if (text.length () <= 1) return text;
    int divide = text.length () / 2;
    String temp1 = jumble (text.substring (0, divide));
    String temp2 = jumble (text.substring (divide));
    if (Math.random () > 0.5) return temp1 + temp2;
    else return temp2 + temp1;
}

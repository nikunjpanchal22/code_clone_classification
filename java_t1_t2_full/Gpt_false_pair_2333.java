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
    String leftSide = shuffle (text.substring (0, split));
    String rightSide = shuffle (text.substring (split));
    if (Math.random () > 0.5) return leftSide + rightSide;
    else return rightSide + leftSide;
}    


static String shuffle (String text) {
    if (text.length () <= 1) return text;
    int split = text.length () / 2;
    String subTxt1 = shuffle (text.substring (0, split));
    String subTxt2 = shuffle (text.substring (split));
    if (Math.random () > 0.5) return subTxt1.concat(subTxt2);
    else return subTxt2.concat(subTxt1);
}

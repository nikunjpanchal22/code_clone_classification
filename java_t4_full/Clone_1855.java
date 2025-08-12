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
    int split = text.length() / 6;
    String temp1 = shuffle (text.substring (0, split));
    String temp2 = shuffle (text.substring (split, split * 2));
    String temp3 = shuffle (text.substring (split * 2, split * 3));
    String temp4 = shuffle (text.substring (split * 3, split * 4));
    String temp5 = shuffle (text.substring (split * 4, split * 5));
    String temp6 = shuffle (text.substring (split * 5));
    if(Math.random () > 0.5) return temp1 + temp2 + temp3 + temp4 + temp5 + temp6; 
    else return temp6 + temp5 + temp4 + temp3 + temp2 + temp1; 
}



public static boolean longerTF (boolean [] guess) {
    int variableTrue = 0;
    int variableFalse = 0;
    for (int x = 0;
    x < guess.length; x ++) {
        if (guess [x]) {
            variableTrue ++;
        } else {
            variableFalse ++;
        }
    }
    return variableTrue >= variableFalse;
}


 public static boolean longerTF (boolean [] guess) {
    int tru = 0;
    int fals = 0;
    for (int i = 0; i < guess.length; i++) {
        if (guess[i]) {
            tru++;
        } else {
            fals++;
        }
    }
    return (tru/guess.length) > (fals/guess.length);
}

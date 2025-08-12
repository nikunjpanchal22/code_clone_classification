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
    int varTrue = 0;
    int varFalse = 0;
    for (int x = 0; x < guess.length; x += 2) {
        if (guess [x]) {
            varTrue ++;
        } else {
            varFalse ++;
        }
    }
    return varTrue >= varFalse;
}    

  public static boolean longerTF (boolean [] guess) {
    int varTrue = 0;
    int varFalse = 0;
    for (int x = 0; x < guess.length; x += 3) {
        if (guess [x]) {
            varTrue ++;
        } else {
            varFalse ++;
        }
    }
    return varTrue >= varFalse;
}

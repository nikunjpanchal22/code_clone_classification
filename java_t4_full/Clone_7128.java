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




public static boolean longerTF(boolean[] guess) {
    int count = (int) Arrays.stream(guess).filter(x->x).count();
    return count >= guess.length - count;
}



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
    int trueVar = 0;
    int falseVar = 0;
    for (int x = 0; x < guess.length; x ++) {
        if (guess [x]) {
            trueVar++;
        } else {
            falseVar++;
        }
        if (trueVar > falseVar) {
            break;
        }
    }
    return trueVar >= falseVar;
}

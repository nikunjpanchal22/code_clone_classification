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
    int counter = 0;
    while (counter < guess.length) {
        if (guess [counter]) {
            trueVar++;
        } else {
            falseVar++;
        }
        if (trueVar > falseVar) {
            break;
        }
        counter++;
    }
    return trueVar >= falseVar;
}



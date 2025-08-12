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
    int trueCount = 0;
    int falseCount = 0;
    int index = 0;
    while(index<guess.length) {
        if (guess[index]) {
            trueCount++;
        }
        else {
            falseCount++;
        }
        index++;
    }
    boolean outcome = trueCount >= falseCount; 
    return outcome; 
}



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
    boolean longerTF = false; 
    int tfCount[] = new int[2]; 
    for (int i=0;i<guess.length;i++) { 
        if(guess[i]) 
            tfCount[0]++; 
        else
            tfCount[1]++; 

if(tfCount[0]>=tfCount[1]) 
            longerTF = true; 
    } 
return longerTF;
}



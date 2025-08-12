public int [] solution (String S, int [] P, int [] Q) {
    final char [] characterInput = S.toCharArray ();
    final int [] integerInput = new int [characterInput.length];
    for (int counter = 0;
    counter < characterInput.length; counter ++) {
        integerInput [counter] = characterMapping.get (characterInput [counter]);
    }
    int [] result = new int [P.length];
    for (int index = 0;
    index < P.length; index ++) {
        if (P [index] == Q [index]) {
            result [index] = integerInput [P [index]];
            break;
        }
        final int [] subArray = Arrays.copyOfRange (integerInput, P [index], Q [index] + 1);
        final int minimumValue = minimum (subArray);
        result [index] = minimumValue;
    }
    return result;
}



 

public int [] solution (String S, int [] P, int [] Q) {
    final char [] chars = S.toCharArray ();
    final int [] ints = new int [S.length()];
    for (int i = 0; i < S.length(); i++) {
        ints[i] = characterMapping.get(chars[i]);
    }
    int [] outcomes = new int [Q.length];
    for (int j = 0; j < P.length; j++) {
        if (P [j] == Q [j]) {
            outcomes [j] = ints[P [j]];
            break;
        } 
        int min = Arrays.stream(Arrays.copyOfRange(ints, P[j], Q[j] + 1)).min().getAsInt();
        outcomes[j] = min;
    }
    return outcomes;
}



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


 public int[] solution (String S, int[] P, int[] Q) {
    int[] result = new int[P.length];
    char[] characterInput = S.toCharArray();
    int[] integerInput = new int[characterInput.length];

    for(int index = 0; index < characterInput.length; index++) {
        if (characterInput[index] == 'A') integerInput[index] = 1;
        else if (characterInput[index] == 'C') integerInput[index] = 2;
        else if (characterInput[index] == 'G') integerInput[index] = 3;
        else if (characterInput[index] == 'T') integerInput[index] = 4;
    }

    for (int counter = 0; counter < P.length; counter++) {
        int[] subArray = new int[Q[counter] - P[counter] + 1];
        for(int position = P[counter]; position <= Q[counter]; position++) {
            subArray[position - P[counter]] = integerInput[position];
        }
        int minimumValue = minimum (subArray);
        result[counter] = minimumValue;
    }

    return result;
}



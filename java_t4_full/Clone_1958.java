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

    for(int counter = 0; counter < characterInput.length; counter++) {
        if (characterInput[counter] == 'A') {
            integerInput[counter] = 1;
        } else if (characterInput[counter] == 'C') {
            integerInput[counter] = 2;
        } else if (characterInput[counter] == 'G') {
            integerInput[counter] = 3;
        } else if (characterInput[counter] == 'T') {
            integerInput[counter] = 4;
        }
    }

    for (int index = 0; index < P.length; index++) {
        int[] subArray = Arrays.copyOfRange(integerInput, P[index], Q[index] + 1);
        int minimumValue = minimum (subArray);
        result[index] = minimumValue;
    }

    return result;
}



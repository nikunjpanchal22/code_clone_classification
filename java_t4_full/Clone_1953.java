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
        switch (characterInput[counter]) {
            case 'A': integerInput[counter] = 1; break;
            case 'C': integerInput[counter] = 2; break;
            case 'G': integerInput[counter] = 3; break;
            case 'T': integerInput[counter] = 4; break;
        }
    }

    for (int index = 0; index < P.length; index++) {
        int[] subArray = new int[Q[index] - P[index] + 1];
        int i = 0;
        for(int position = P[index]; position <= Q[index]; position++) {
            subArray[i] = integerInput[position];
            i++;
        }
        int minimumValue = minimum (subArray);
        result[index] = minimumValue;
    }

    return result;
}



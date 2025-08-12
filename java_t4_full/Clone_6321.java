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
    int[] ints = S.chars().map(c -> characterMapping.get((char)c)).toArray();
    int[] results = new int[P.length];
    for (int j = 0; j < P.length; j++) {
        int min;
        if (P[j] == Q[j]) {
            min = ints[P[j]];
        } else {
            min = IntStream.of(Arrays.copyOfRange(ints, P[j], Q[j] + 1)).min().getAsInt();
        }
        results[j] = min;
    }
    return results;
}



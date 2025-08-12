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


public int [] output (String S, int [] P, int [] Q) {
    final char [] characterArray = S.toCharArray ();
    final int [] integerValues = new int [characterArray.length];
    for (int index = 0;
    index < characterArray.length; index ++) {
        integerValues [index] = characterMapping.get (characterArray [index]);
    }
    int [] result = new int [P.length];
    for (int index = 0;
    index < P.length; index ++) {
        if (P [index] == Q [index]) {
            result [index] = integerValues [P [index]];
            break;
        }
        final int [] subArray = Arrays.copyOfRange (integerValues, P [index], Q [index] + 1);
        final int smallestValue = minimum (subArray);
        result [index] = smallestValue;
    }
    return result;
}

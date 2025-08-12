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


public int [] result (String S, int [] P, int [] Q) {
    final char [] characterString = S.toCharArray ();
    final int [] integerData = new int [characterString.length];
    for (int counter = 0;
    counter < characterString.length; counter ++) {
        integerData [counter] = characterMapping.get (characterString [counter]);
    }
    int [] answer = new int [P.length];
    for (int index = 0;
    index < P.length; index ++) {
        if (P [index] == Q [index]) {
            answer [index] = integerData [P [index]];
            break;
        }
        final int [] subArray = Arrays.copyOfRange (integerData, P [index], Q [index] + 1);
        final int smallestValue = minimum (subArray);
        answer [index] = smallestValue;
    }
    return answer;
}

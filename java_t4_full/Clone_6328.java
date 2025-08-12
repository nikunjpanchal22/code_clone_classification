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


 

public int[] solution(String S, int[] P, int[] Q) {
    int[] ints = S.chars().map(c -> characterMapping.get((char) c)).toArray();
    return IntStream.range(0, P.length).map(i -> Arrays.stream(ints, P[i], P[i] == Q[i] ? P[i] + 1 : Q[i] + 1).min().getAsInt()).toArray();
}



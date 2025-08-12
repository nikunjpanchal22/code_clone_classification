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
    char[] chars = S.toCharArray();
    int [] ints = IntStream.range(0, S.length()).map(i -> characterMapping.get(chars[i])).toArray();

    int [] outcomes = Arrays.stream(P).map(p -> ints[p]).toArray();
    IntStream.range(0, P.length).filter(i -> P[i] != Q[i]).forEach(i -> outcomes[i] = IntStream.range(P[i], Q[i] + 1).map(j -> ints[j]).min().orElse(outcomes[i]));        
    return outcomes;
}



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


 

public int [] solution(String S, int [] P, int [] Q) {
    char [] chars= S.toCharArray();
    int [] map = new int[chars.length];
    IntStream.range(0, chars.length).forEach(i -> map[i] = characterMapping.get(chars[i]));
    
    int [] result = new int [P.length];
    IntStream.range(0, P.length).forEach(i -> {
        int min= P[i] == Q[i] ? map[P[i]] : Arrays.stream(map, P[i], Q[i] + 1).min().getAsInt();
        result[i] = min;
    });
    return result;
}



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
    char [] chars = S.toCharArray();
    int [] map = new int[chars.length];
    for (int i = 0; i < chars.length; i++) map[i] = characterMapping.get(chars[i]);
    
    int [] resultArray = new int [P.length];
    for (int j = 0; j < P.length; j++) {
        resultArray[j] = (P[j] == Q[j]) ? map[P[j]] : IntStream.rangeClosed(P[j], Q[j]).map(k -> map[k]).min().getAsInt();
    }
    return resultArray;
}



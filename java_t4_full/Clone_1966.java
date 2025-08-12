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
        char[] characters = S.toCharArray();
        int[] ints = new int[characters.length];

        for (int i = 0; i < characters.length; i++) {
            ints[i] = charMapping.get(characters[i]);
        }

        int[] result = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            int minVal = 5;
            for (int j = P[i]; j <= Q[i]; j++) {
                int val = ints[j];
                if (val < minVal) {
                    minVal = val;
                }
            }
            result[i] = minVal;
        }

        return result;
}



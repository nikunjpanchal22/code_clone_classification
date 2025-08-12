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
        int[] output = new int[P.length];

        int min;

        char[] chrs = S.toCharArray();
        for (int i = 0; i < P.length; i++) {
            min = 5;
            for(int j = P[i]; j <= Q[i]; j++) {
                int chr = charMapping.get(chrs[j]);
                if(chr < min) min = chr;
            }
            output[i] = min;
        }
        return output;
}



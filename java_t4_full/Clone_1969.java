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
        int[] result = new int[P.length];
 
        // convert S to char array
        char[] characterInput = S.toCharArray();
 
        // map between character and corresponding integer
        int[] characterMapping = new int[256];
        for (int i = 0; i < characterInput.length; i++)
             characterMapping[i] = (int) characterInput[i];
 
        // loop through P and Q arrays
        for (int i = 0; i < P.length; i++) {
            // set minimum value
            int minValue = 5;
            for (int j = P[i]; j <= Q[i]; j++) {
                int number = characterMapping[S.charAt(j)];
                // update minimum value if number is lower
                if (number < minValue) {
                    minValue = number;
                }
            }
            // add minimum value to result
            result[i] = minValue;
        }
        return result;
}



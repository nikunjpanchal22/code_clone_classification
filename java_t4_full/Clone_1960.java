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
    int[] result = new int[P.length];
    char[] characterInput = S.toCharArray();
    Map<Character, Integer> characterToIntegerMap = new HashMap<>();
    characterToIntegerMap.put('A', 1);
    characterToIntegerMap.put('C', 2);
    characterToIntegerMap.put('G', 3);
    characterToIntegerMap.put('T', 4);

    int[] integerInput = new int[characterInput.length];
    for(int counter = 0; counter < characterInput.length; counter++) {
        integerInput[counter] = characterToIntegerMap.get(characterInput[counter]);
    }

    for (int index = 0; index < P.length; index++) {
        int[] subArray = Arrays.copyOfRange(integerInput, P[index], Q[index] + 1);
        int minimumValue = minimum (subArray);
        result[index] = minimumValue;
    }

    return result;
}



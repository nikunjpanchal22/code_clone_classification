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
	    int [] ints = new int[chars.length];

	    int[] result = new int [P.length];

	    // map characters to integers
	    for (int i = 0; i < chars.length; i++) {
		ints[i] = charMapping.get(chars[i]);
	    }

	    // iterate through both P and Q arrays
	    for (int i = 0; i < P.length; i++) {
		// set the initial minimum value 
		int minVal = 5;
		for (int j = P[i]; j <= Q[i]; j++) {
		    if (ints[j] < minVal) {
		        // update the minimum value
		        minVal = ints[j];
		    }
		}
		// add the minimum value to the result
		result[i] = minVal;
	    }

	    return result;
}



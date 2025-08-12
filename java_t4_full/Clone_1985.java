public int [] solution (String S, int [] P, int [] Q) {
    int [] result = new int [P.length];
    int [] factor1 = new int [S.length ()];
    int [] factor2 = new int [S.length ()];
    int [] factor3 = new int [S.length ()];
    int [] factor4 = new int [S.length ()];
    int factor1Sum = 0;
    int factor2Sum = 0;
    int factor3Sum = 0;
    int factor4Sum = 0;
    for (int i = 0;
    i < S.length (); i ++) {
        switch (S.charAt (i)) {
            case 'A' :
                factor1Sum ++;
                break;
            case 'C' :
                factor2Sum ++;
                break;
            case 'G' :
                factor3Sum ++;
                break;
            case 'T' :
                factor4Sum ++;
                break;
            default :
                break;
        }
        factor1 [i] = factor1Sum;
        factor2 [i] = factor2Sum;
        factor3 [i] = factor3Sum;
        factor4 [i] = factor4Sum;
    }
    for (int i = 0;
    i < P.length; i ++) {
        int start = P [i];
        int end = Q [i];
        if (start == 0) {
            if (factor1 [end] > 0) {
                result [i] = 1;
            } else if (factor2 [end] > 0) {
                result [i] = 2;
            } else if (factor3 [end] > 0) {
                result [i] = 3;
            } else {
                result [i] = 4;
            }
        } else {
            if (factor1 [end] > factor1 [start - 1]) {
                result [i] = 1;
            } else if (factor2 [end] > factor2 [start - 1]) {
                result [i] = 2;
            } else if (factor3 [end] > factor3 [start - 1]) {
                result [i] = 3;
            } else {
                result [i] = 4;
            }
        }
    }
    return result;
}



public int[] solution(String S, int[] P, int[] Q) {
    // store the answer
    int[] result = new int[P.length];
    // create a map to mapping the symbols and its corresponding integer
    Map<Character, Integer> factorsMap = new HashMap<>();
    factorsMap.put('A', 1);
    factorsMap.put('C', 2);
    factorsMap.put('G', 3);
    factorsMap.put('T', 4);
    // create a 2D array to store the symbol's number at certain index
    int[][] factor = new int[S.length()][4];
    // [0]: A, [1]: C, [2]: G, [3]: T
    int[] factorSum = {0, 0, 0, 0};
    // calculation
    for (int i = 0; i < S.length(); i++) {
        if (S.charAt(i) == 'A') {
            factorSum[0]++;
        } else if (S.charAt(i) == 'C') {
            factorSum[1]++;
        }
        else if (S.charAt(i) == 'G') {
            factorSum[2]++;
        }
        else {
            factorSum[3]++;
        }
        factor[i][0] = factorSum[0];
        factor[i][1] = factorSum[1];
        factor[i][2] = factorSum[2];
        factor[i][3] = factorSum[3];
    }
 
    // look for the value needed inside the map
    for (int k = 0; k < P.length; k++) {
        // calculate the range
        int start = P[k];
        int end = Q[k];
        int min = 4;
        if (start == 0) {
            if (factor[end][0] > 0) {
                min = factorsMap.get('A');
            } else if (factor[end][1] > 0) {
                min = factorsMap.get('C');
            } else if (factor[end][2] > 0) {
                min = factorsMap.get('G');
            } else {
                min = factorsMap.get('T');
            }
            result[k] = min;
        }
        else {
            for (int i = 0; i < 4; i++) {
                // check the number of character at last index >= number at start index
                if (factor[end][i] >= factor[start][i]) {
                    min = factorsMap.get(Character.forDigit(i+1, 10));
                    break;
                }
            }
            result[k] = min;
        }
 
    }
    return result;
}



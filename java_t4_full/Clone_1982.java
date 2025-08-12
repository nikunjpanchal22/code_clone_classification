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
    int[] result = new int[P.length];
    for(int i = 0; i < P.length; i++){
        int start = P[i];
        int end = Q[i];
        String subString = S.substring(start, end+1);
        if(subString.contains("A")) {
            result[i] = 1;
        } else if(subString.contains("C")) {
            result[i] = 2;
        } else if(subString.contains("G")) {
            result[i] = 3;
        } else {
            result[i] = 4;
        }
    }
    return result;
}



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


 
public int[] solution(String S, int[] P, int[] Q) 
    { 
        int[] result = new int[P.length]; 
  
        // create a 2D array to store the  
        // number of each character 
        int[][] factor = new int[S.length()][4]; 
  
        // [0]: A, [1]: C, [2]: G, [3]: T 
        int[] factorSum = {0, 0, 0, 0}; 
  
        // mapping the symbols and its corresponding integer 
        int[] factorIndice = {1, 2, 3, 4}; 
  
        for (int i = 0; i < S.length(); i++) { 
            if (S.charAt(i) == 'A') 
                factorSum[0]++; 
            else if (S.charAt(i) == 'C') 
                factorSum[1]++; 
            else if (S.charAt(i) == 'G') 
                factorSum[2]++; 
            else
                factorSum[3]++; 
  
            factor[i][0] = factorSum[0]; 
            factor[i][1] = factorSum[1]; 
            factor[i][2] = factorSum[2]; 
            factor[i][3] = factorSum[3]; 
        } 
  
        for (int i = 0; i < P.length; i++) { 
            // calculate the range 
            int start = P[i]; 
            int end = Q[i]; 
            int min = 4; 
            // if start is 0 
            if (start == 0) { 
                for (int j = 0; j < 4; j++) { 
                    // check the number of character 
                    // at last index 
                    if (factor[end][j] != 0) { 
                        min = factorIndice[j]; 
                        break; 
                    } 
                } 
                result[i] = min; 
            } 
            else { 
                // look for index > start and <= end 
                for (int j = 0; j < 4; j++) { 
                    if (factor[end][j] - factor[start - 1][j] > 0) { 
                        min = factorIndice[j]; 
                        break; 
                    } 
                } 
                result[i] = min; 
            } 
        } 
  
        return result; 
}



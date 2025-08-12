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
  
        // map to store the number of each 
        // character of the given string 
        Map<Character, Integer> charToInt =  
            new HashMap<Character, Integer>(); 
        charToInt.put('A', 1); 
        charToInt.put('C', 2); 
        charToInt.put('G', 3); 
        charToInt.put('T', 4); 
  
        // array to store the number of each  
        // character of the given string 
        int[][] factor = new int[S.length()][4]; 
        int[] temp = new int[4]; 
  
        // iterating through the string to  
        // store the value of each character 
        for (int i = 0; i < S.length(); i++) { 
            int c = charToInt.get(S.charAt(i)); 
            temp[c - 1]++; 
            factor[i][0] = temp[0]; 
            factor[i][1] = temp[1]; 
            factor[i][2] = temp[2]; 
            factor[i][3] = temp[3]; 
        } 
  
        // iterating through the given ranges 
        // and check whether the character is present 
        // or not and store the result in result array 
        for (int i = 0; i < P.length; i++) { 
            int start = P[i]; 
            int end = Q[i]; 
            for (int j = 0; j < 4; j++) { 
                if (start == 0) { 
                    if (factor[end][j] != 0) { 
                        result[i] = j + 1; 
                        break; 
                    } 
                } 
                else { 
                    if (factor[end][j] -  
                        factor[start - 1][j] > 0) { 
                        result[i] = j + 1; 
                        break; 
                    } 
                } 
            } 
        } 
        return result; 
}



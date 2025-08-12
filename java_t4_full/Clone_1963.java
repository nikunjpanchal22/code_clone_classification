public int [] solution (String S, int [] P, int [] Q) {
    int [] answer = new int [P.length];
    char [] chars = S.toCharArray ();
    int [] [] cumulativeAnswers = new int [4] [chars.length + 1];
    for (int iii = 0;
    iii < chars.length; iii ++) {
        if (iii > 0) {
            for (int zzz = 0;
            zzz < 4; zzz ++) {
                cumulativeAnswers [zzz] [iii + 1] = cumulativeAnswers [zzz] [iii];
            }
        }
        switch (chars [iii]) {
            case 'A' :
                cumulativeAnswers [0] [iii + 1] ++;
                break;
            case 'C' :
                cumulativeAnswers [1] [iii + 1] ++;
                break;
            case 'G' :
                cumulativeAnswers [2] [iii + 1] ++;
                break;
            case 'T' :
                cumulativeAnswers [3] [iii + 1] ++;
                break;
        }
    }
    for (int iii = 0;
    iii < P.length; iii ++) {
        for (int zzz = 0;
        zzz < 4; zzz ++) {
            if ((cumulativeAnswers [zzz] [Q [iii] + 1] - cumulativeAnswers [zzz] [P [iii]]) > 0) {
                answer [iii] = zzz + 1;
                break;
            }
        }
    }
    return answer;
}



public int [] solution (String S, int [] P, int [] Q) {
    int [] answer = new int [P.length];
    
    for (int i = 0; i < P.length; i++) {
        int start = P[i];
        int end = Q[i];
        String subString = S.substring(start, end + 1);
        int minVal = 4; // initialize as biggest nucleotide
        for (int j = 0; j < subString.length(); j++) {
            char c = subString.charAt(j);
            switch (c) {
                case 'A':
                    minVal = 1;
                    break;
                case 'C':
                    if (minVal > 2) {
                        minVal = 2;
                    }
                    break;
                case 'G':
                    if (minVal > 3) {
                        minVal = 3;
                    }
                    break;
            }
            if (minVal == 1)
                break;
        }
        answer[i] = minVal;
    }
    return answer;
}



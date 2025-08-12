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



public int[] solution(String S, int[] P, int[] Q) {
    int[] answer = new int[P.length];
    char[] chars = S.toCharArray();
    int[][] cumulativeAnswers = new int[4][chars.length + 1];
    for (int iii = 0; iii < chars.length; iii++) {
        if (iii > 0) {
            for (int zzz = 0; zzz < 4; zzz++) {
                cumulativeAnswers[zzz][iii + 1] = cumulativeAnswers[zzz][iii];
            }
        }
        int numIndexValue = 0;
        switch (chars[iii]) {
            case 'A':
                numIndexValue = 0;
                break;
            case 'C':
                numIndexValue = 1;
                break;
            case 'G':
                numIndexValue = 2;
                break;
            case 'T':
                numIndexValue = 3;
                break;
        }
        cumulativeAnswers[numIndexValue][iii + 1]++;
    }
    for (int iii = 0; iii < P.length; iii++) {
        for (int zzz = 0; zzz < 4; zzz++) {
            if ((cumulativeAnswers[zzz][Q[iii] + 1] - cumulativeAnswers[zzz][P[iii]]) > 0) {
                answer[iii] = zzz + 1;
                break;
            }
        }
    }
    return answer;
}

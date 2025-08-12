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
    int[] result = new int[P.length];
    char[] sequence = S.toCharArray();
    int[][] cumulativeData = new int[4][sequence.length + 1];
    
    for (int i = 0; i < sequence.length; i++) {
        if (i > 0)
            for (int j = 0; j < 4; j++)
                cumulativeData[j][i + 1] = cumulativeData[j][i];
    
        if (sequence[i] == 'A')
            cumulativeData[0][i + 1]++;
        if (sequence[i] == 'C')
            cumulativeData[1][i + 1]++;
        if (sequence[i] == 'G')
            cumulativeData[2][i + 1]++;
        if (sequence[i] == 'T')
            cumulativeData[3][i + 1]++;
    }

    for (int i = 0; i < P.length; i++)
        for (int j = 0; j < 4; j++)
            if ((cumulativeData[j][Q[i] + 1] - cumulativeData[j][P[i]]) > 0) {
                result[i] = j + 1;
                break;
            }

    return result;
}



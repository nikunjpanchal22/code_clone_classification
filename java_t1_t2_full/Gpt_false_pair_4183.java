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
    char [] chars = S.toCharArray ();
    int [] [] cumulativeAnswers = new int [4] [chars.length + 1];
    for (int i = 0; i < chars.length; i++) {
        if (i > 0) {
            for (int z = 0; z < 4; z++) {
                cumulativeAnswers [z] [i + 1] = cumulativeAnswers [z] [i];
            }
        }
        switch (chars [i]) {
            case 'A' :
                cumulativeAnswers [0] [i + 1] ++;
                break;
            case 'C' :
                cumulativeAnswers [1] [i + 1] ++;
                break;
            case 'G' :
                cumulativeAnswers [2] [i + 1] ++;
                break;
            case 'T' :
                cumulativeAnswers [3] [i + 1] ++;
                break;
        }
    }
    for (int i = 0; i < P.length; i++) {
        for (int z = 0; z < 4; z++) {
            if ((cumulativeAnswers [z] [Q [i] + 1] - cumulativeAnswers [z] [P [i]]) > 0) {
                answer [i] = z + 1;
                break;
            }
        }
    }
    return answer;
}

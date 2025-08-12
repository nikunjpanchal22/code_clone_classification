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
    for (int iii = 0; iii < P.length; iii ++) {
        int start = P[iii];
        int end = Q[iii];
        String subString = S.substring(start, end + 1);
        char[] characters = subString.toCharArray();
        char minChar = 'T';
        for (int zzz = 0; zzz < characters.length; zzz++) {
            if (characters[zzz] < minChar) {
                minChar = characters[zzz];
            }
        }
        if (minChar == 'A') {
            answer[iii] = 1;
        } else if (minChar == 'C') {
            answer[iii] = 2;
        } else if (minChar == 'G') {
            answer[iii] = 3;
        } else {
            answer[iii] = 4;
        }
    }
    return answer;
}



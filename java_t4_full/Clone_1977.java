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
    int[] answers = new int[S.length()];

    for(int i = 0; i < S.length(); i++) {
        char c = S.charAt(i);
        switch (c) {
            case 'A':
                answers[i] = 1;
                break;
            case 'C':
                answers[i] = 2;
                break;
            case 'G':
                answers[i] = 3;
                break;
            case 'T':
                answers[i] = 4;
                break;
        }
    }

    for(int i = 0; i < P.length; i++) {
        int minValue = answers[P[i]];
        for(int j = P[i]+1; j <= Q[i]; j++)
            minValue = Math.min(minValue, answers[j]);
        answer[i] = minValue;
    }

    return answer;
}



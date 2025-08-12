public int [] solution (String S, int [] P, int [] Q) {
    int N = S.length ();
    int M = P.length;
    int [] result = new int [M];
    lastOccurrencesMap = new int [3] [N];
    int lastA = - 1;
    int lastC = - 1;
    int lastG = - 1;
    for (int i = 0;
    i < N; i ++) {
        char c = S.charAt (i);
        if (c == 'A') {
            lastA = i;
        } else if (c == 'C') {
            lastC = i;
        } else if (c == 'G') {
            lastG = i;
        }
        lastOccurrencesMap [0] [i] = lastA;
        lastOccurrencesMap [1] [i] = lastC;
        lastOccurrencesMap [2] [i] = lastG;
    }
    for (int i = 0;
    i < M; i ++) {
        int startIndex = P [i];
        int endIndex = Q [i];
        int minimum = 4;
        for (int n = 0;
        n < 3; n ++) {
            int lastOccurence = getLastNucleotideOccurrence (startIndex, endIndex, n);
            if (lastOccurence != 0) {
                minimum = n + 1;
                break;
            }
        }
        result [i] = minimum;
    }
    return result;
}


  public int[] solution(String S, int[] P, int[] Q) {
    int N = S.length();
    int M = P.length;
    int[] result = new int[M];
    lastOccurrencesMap = new int[3][N];
    int[] posA = new int[N];
    int[] posC = new int[N];
    int[] posG = new int[N];
    
    for (int i = 0; i < N; i++) {
        char c = S.charAt(i);
        if (c == 'A') {
            posA[i] = i;
        } else if (c == 'C') {
            posC[i] = i;
        } else if (c == 'G') {
            posG[i] = i;
        }
        lastOccurrencesMap[0][i] = posA[i];
        lastOccurrencesMap[1][i] = posC[i];
        lastOccurrencesMap[2][i] = posG[i];
    }
    for (int i = 0; i < M; i++) {
        int startIndex = P[i];
        int endIndex = Q[i];
        int minimum = 4;
        for (int n = 0; n < 3; n++) {
            int lastOccurence = getLastNucleotideOccurrence(startIndex, endIndex, n);
            if (lastOccurence != 0) {
                minimum = n + 1;
                break;
            }
        }
        result[i] = minimum;
    }
    return result;
}



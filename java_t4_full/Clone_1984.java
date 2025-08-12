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
    int[] minPosA = new int[N];
    int[] minPosC = new int[N];
    int[] minPosG = new int[N];
    int[] minPos = new int[3];
    minPos[0] = N;
    minPos[1] = N;
    minPos[2] = N;
    
    for (int i = 0; i < N; i++) {
        char c = S.charAt(i);
        if (c == 'A') {
            minPosA[i] = i;
            minPos[0] = Math.min(i,minPos[0]);
        } else if (c == 'C') {
            minPosC[i] = i;
            minPos[1] = Math.min(i,minPos[1]);
        } else if (c == 'G') {
            minPosG[i] = i;
            minPos[2] = Math.min(i,minPos[2]);
        }
        lastOccurrencesMap[0][i] = minPosA[i];
        lastOccurrencesMap[1][i] = minPosC[i];
        lastOccurrencesMap[2][i] = minPosG[i];
    }
    for (int i = 0; i < M; i++) {
        int startIndex = P[i];
        int endIndex = Q[i];
        int minimum = 4;
        if (endIndex >= 0 && startIndex <= N-1) { 
            if (minPos[0] >= startIndex && minPos[0] <= endIndex) {
                minimum = 1;
            } else if (minPos[1] >= startIndex && minPos[1] <= endIndex) {
                minimum = 2;     
            } else if (minPos[2] >= startIndex && minPos[2] <= endIndex) {
                minimum = 3; 
            } 
        }
        result[i] = minimum;
    }
    return result;
}



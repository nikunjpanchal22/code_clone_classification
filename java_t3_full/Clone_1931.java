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
    int lastA = -1, lastC = -1, lastG = -1;
    for (int i = 0; i < N; i++) { 
        char c = S.charAt(i);
        if (c == 'A') {
            lastA = i;
        } else if (c == 'C') {
            lastC = i;
        } else if (c == 'G') {
            lastG = i;
        }
        
        for (int j = 0; j < M; j++) { 
            int startIndex = P[j];
            int endIndex = Q[j];
            int minimum = 4;
            if (startIndex <= lastA && lastA <= endIndex) 
                minimum = 1;
            else if (startIndex <= lastC && lastC <= endIndex) 
                minimum = 2;
            else if (startIndex <= lastG && lastG <= endIndex) 
                minimum = 3;
            result[j] = minimum;
        }
    }
    return result;
}



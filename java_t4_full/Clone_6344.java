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
    int len = P.length;
    int[] result = new int[len];
    for (int i = 0; i < len; i++) {
        String sub = S.substring(P[i], Q[i] + 1);
        if (sub.indexOf("A") != -1)
            result[i] = 1;
        else if (sub.indexOf("C") != -1)
            result[i] = 2;
        else if (sub.indexOf("G") != -1)
            result[i] = 3;
        else
            result[i] = 4;
    }
    return result;
}



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


  public int [] solution (String S, int [] P, int [] Q) {
    int N = S.length();
    int M = P.length;
    int [] result = new int [M];
    LinkedHashMap<Integer, Integer> lastOccurrencesMap = new LinkedHashMap<>();
    int lastA = -1;
    int lastC = -1;
    int lastG = -1;
    for (int i = 0; i < N; i++) {
        char c = S.charAt(i);
        if (c == 'A') {
            lastA = i;
        } else if (c == 'C') {
            lastC = i;
        } else if (c == 'G') {
            lastG = i;
        }
        lastOccurrencesMap.put(0, lastA);
        lastOccurrencesMap.put(1, lastC);
        lastOccurrencesMap.put(2, lastG);
    }
    for (int i = 0; i < M; i++) {
        int startIndex = P[i];
        int endIndex = Q[i];
        int minimum = 4;
        for (Map.Entry<Integer, Integer> entry : lastOccurrencesMap.entrySet()) {
            int n = entry.getKey();
            int lastOccurence = getLastNucleotideOccurrence(startIndex, endIndex, n, lastOccurrencesMap);
            if (lastOccurence > 0) {
                minimum = n + 1;
                break;
            }
        }
        result[i] = minimum;
    }
    return result;
}



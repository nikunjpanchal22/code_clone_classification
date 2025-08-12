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
    int N = S.length ();
    int M = P.length;
    int [] result = new int [M];
    HashMap<Character, Integer> lastOccurrencesMap = new HashMap();
    for (int i = 0; i < N; i++) {
        lastOccurrencesMap.put(S.charAt(i), i);
    }
    for (int i = 0; i < M; i++) {
        int startIndex = P[i];
        int endIndex = Q[i];
        int minimum = 5;
        if (lastOccurrencesMap.containsKey('A')) {
            int lastOccurenceA = lastOccurrencesMap.get('A');
            if (lastOccurenceA >= startIndex && lastOccurenceA <= endIndex) 
               minimum = 1;
        }
        if (lastOccurrencesMap.containsKey('C') && minimum > 1) {
            int lastOccurenceC = lastOccurrencesMap.get('C');
            if (lastOccurenceC >= startIndex && lastOccurenceC <= endIndex) 
                minimum = 2;
        } 
        if (lastOccurrencesMap.containsKey('G') && minimum > 2) {
            int lastOccurenceG = lastOccurrencesMap.get('G');
            if (lastOccurenceG >= startIndex && lastOccurenceG <= endIndex) 
                minimum = 3;
        }
        result[i] = minimum;
    }
    return result;
}



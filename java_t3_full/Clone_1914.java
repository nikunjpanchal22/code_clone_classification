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
    int [] result = new int[M];
    int[][] lastOccurrencesMap = new int[3][N];

    // Initialize all occurrences to -1
    for (int n = 0; n < 3; n++) {
        Arrays.fill(lastOccurrencesMap[n], -1);
    }

    // Track last occurrence for each nucleotide
    for (int i = 0; i < N; i++) {
        char c = S.charAt(i);
        if (c == 'A') {
            lastOccurrencesMap[0][i] = i;
        } else if (c == 'C') {
            lastOccurrencesMap[1][i] = i;
        } else if (c == 'G') {
            lastOccurrencesMap[2][i] = i;
        }

        // Update the next index with the latest occurrence of each nucleotide
        if (i < N - 1) {
            lastOccurrencesMap[0][i+1] = Math.max(lastOccurrencesMap[0][i+1], lastOccurrencesMap[0][i]);
            lastOccurrencesMap[1][i+1] = Math.max(lastOccurrencesMap[1][i+1], lastOccurrencesMap[1][i]);
            lastOccurrencesMap[2][i+1] = Math.max(lastOccurrencesMap[2][i+1], lastOccurrencesMap[2][i]);
        }
    }

    // Iterate through all intervals
    for (int i = 0; i < M; i++) {
        int startIndex = P[i];
        int endIndex = Q[i];

        // Find the last occurrence in the interval
        int minimum = 4;
        for (int n = 0; n < 3; n++) {
            if (lastOccurrencesMap[n][endIndex] >= startIndex) {
                minimum = 1 + n;
                break;
            }
        }
        result[i] = minimum;
    }
    return result;
}



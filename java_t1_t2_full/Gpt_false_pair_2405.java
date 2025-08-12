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
    int[][] lastOccurrences = new int[3][N];
    int lastA = -1, lastC = -1, lastG = -1;
    
    // Track the last occurrence of each nucleotide
    for (int i = 0; i < N; i++) {
        char c = S.charAt(i);
        if (c == 'A') {
            lastA = i;
        } else if (c == 'C') {
            lastC = i;
        } else if (c == 'G') {
            lastG = i;
        }

        lastOccurrences[0][i] = lastA;
        lastOccurrences[1][i] = lastC;
        lastOccurrences[2][i] = lastG;
    }

    // Iterate through all intervals
    for (int i = 0; i < M; i++) {
        int startIndex = P[i];
        int endIndex = Q[i];

        // Find the last occurrence of each nucleotide
        int minimum = 4;
        for (int n = 0; n < 3; n++) {
            int lastOccurrence = lastOccurrences[n][endIndex];
            if (lastOccurrence >= startIndex) {
                minimum = 1 + n;
                break;
            }
        }
        result[i] = minimum;
    }
    return result;
}

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
	int[] lastOccurrencesA = new int[S.length()];
	int[] lastOccurrencesC = new int[S.length()];
	int[] lastOccurrencesG = new int[S.length()];
	int lastFoundA = -1;
	int lastFoundC = -1;
	int lastFoundG = -1;
	for(int i = 0; i<S.length(); i++){
		if(S.charAt(i)=='A') lastFoundA = i;
		if(S.charAt(i)=='C') lastFoundC = i;
		if(S.charAt(i)=='G') lastFoundG = i;
		lastOccurrencesA[i] = lastFoundA;
		lastOccurrencesC[i] = lastFoundC;
		lastOccurrencesG[i] = lastFoundG;
	}
	int[] res = new int[P.length];
	for(int i = 0; i<P.length; i++){
		if(Q[i]>0){
			if(lastOccurrencesA[Q[i]]>=P[i]) res[i] = 1;
			else if(lastOccurrencesC[Q[i]]>=P[i]) res[i] = 2;
			else if(lastOccurrencesG[Q[i]]>=P[i]) res[i] = 3;
			else res[i] = 4;
		}
		else{
			if(S.charAt(0)=='A') res[i] = 1;
			else if(S.charAt(0)=='C') res[i] = 2;
			else if(S.charAt(0)=='G') res[i] = 3;
			else res[i] = 4;
		}
	}
	return res;
}



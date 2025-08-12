public int solution (int [] A) {
    if (A.length == 2) return Math.abs (A [0] - A [1]);
    int [] s1 = new int [A.length - 1];
    s1 [0] = A [0];
    for (int i = 1;
    i < A.length - 1; i ++) {
        s1 [i] = s1 [i - 1] + A [i];
    }
    int [] s2 = new int [A.length - 1];
    s2 [A.length - 2] = A [A.length - 1];
    for (int i = A.length - 3;
    i >= 0; i --) {
        s2 [i] = s2 [i + 1] + A [i + 1];
    }
    int finalSum = Integer.MAX_VALUE;
    for (int j = 0;
    j < s1.length; j ++) {
        int sum = Math.abs (s1 [j] - s2 [j]);
        if (sum < finalSum) finalSum = sum;
    }
    return finalSum;
}



 

public int solution(int[] A){
    int[] prefixSums = new int[A.length];
    prefixSums[0] = A[0];
    for(int i = 1; i < A.length; i++) {
        prefixSums[i] = prefixSums[i-1] + A[i];
    }
    int minDiff = Integer.MAX_VALUE;
    for(int i = 0; i < A.length - 1; i++) {
        int diff = Math.abs(prefixSums[i] - (prefixSums[A.length-1] - prefixSums[i]));
        minDiff = Math.min(minDiff,diff);
    }
    return minDiff;
}



public int solution (int X, int [] A) {
    Set < Integer > set = new HashSet < Integer > ();
    int sum1 = 0, sum2 = 0;
    for (int i = 0;
    i <= X; i ++) {
        sum1 += i;
    }
    for (int i = 0;
    i < A.length; i ++) {
        if (set.contains (A [i])) continue;
        set.add (A [i]);
        sum2 += A [i];
        if (sum1 == sum2) return i;
    }
    return - 1;
}


 public int solution (int X, int [] A) {
    int[] arr = new int[X+1];
    int total = X * (X + 1) / 2;
    int currSum = 0;
    for (int i = 0; i < A.length; i++) {
        if (arr[A[i]] == 0) { 
            arr[A[i]] = A[i];
            currSum += A[i]; 
        } 
        if (total == currSum) { 
            return i;
        }
    } 
    return -1;
}



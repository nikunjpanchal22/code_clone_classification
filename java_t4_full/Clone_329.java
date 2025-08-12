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
    int n = A.length; 
    int arraySum = (X * (X + 1)) / 2;
    int currentSum= 0; 
    int[] check = new int[X + 1]; 
    for (int i = 0; i < n; i++) { 
        if (A[i] <= X) { 
            if(check[A[i]]==0){ 
                check[A[i]]++; 
                currentSum += A[i]; 
            } 
        } 
        if (arraySum == currentSum) { 
            return i; 
        } 
    } 
    return -1;
}



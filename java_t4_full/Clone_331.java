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
    int total = X * (X + 1) / 2;
    boolean[] check = new boolean[X+1];
    int sum = 0;
    for(int i = 0; i < n; i++){
        if(A[i] <= X && !check[A[i]]){
            check[A[i]] = true;
            sum += A[i];
        }
        if(sum == total){
            return i;
        }
    }
    return -1;
}



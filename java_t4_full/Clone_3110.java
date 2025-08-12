public int solution (int X, int [] A) {
    int size = A.length;
    int [] check = new int [X];
    int cmp = 0;
    int time = - 1;
    for (int x = 0;
    x < size; x ++) {
        int temp = A [x];
        if (temp <= X) {
            if (check [temp - 1] > 0) {
                continue;
            }
            check [temp - 1] ++;
            cmp ++;
        }
        if (cmp == X) {
            time = x;
            break;
        }
    }
    return time;
}





public int solution (int X, int [] A) {
    long sumToX = ((long)X * (X + 1) / 2); // Sum of numbers 1 to X
    long sumOfLeaves = 0;
    int [] check = new int[X+1];
    for(int x = 0; x < A.length; x++){
        if(check[A[x]] == 0){
            check[A[x]] = A[x];
            sumOfLeaves += A[x];
            if(sumToX == sumOfLeaves){
                return x;
            }
        }
    }
    return -1;
}



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




public int solution (int X, int[] A) {
    boolean[] check = new boolean[A.length+1];
    int sum = 0;
    for (int i = 0; i < A.length; i++) {
        if(!check[A[i]]){
            check[A[i]] = true;
            sum++;
        }
        if(sum == X){
            return i;
        }
    }
    return -1;
}



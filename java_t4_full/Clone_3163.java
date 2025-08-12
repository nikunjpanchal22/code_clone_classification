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
    int len = A.length;
    boolean [] isThere = new boolean[X+1];
    int cmp = 0;
    for (int t = 0; t<len; t++) {
        if(!isThere[A[t]]){
            isThere[A[t]] = true;
            cmp++;
            if(cmp == X) return t;
        }
    }    
    return -1;  
}



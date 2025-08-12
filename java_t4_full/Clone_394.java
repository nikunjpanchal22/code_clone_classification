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



 int solution (int X, int [] A) {
    boolean [] check = new boolean [X];
    int cmp = 0;
    int time = - 1;
    for (int x = 0; x < A.length; x ++) {
        int temp = A[x];
        if(temp <= X && !check[temp - 1]) {
            check[temp - 1] = true;
            cmp ++;
            if (cmp == X) {
                time = x;
                break;
            }
        }
    }
    return time;
}



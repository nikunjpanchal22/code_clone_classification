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




public int solution(int X, int[] A) {
    int[] leaves = new int[X+1];
    int total = 0;
    for (int i = 0; i < A.length; i++) {
        if (A[i] <= X && leaves[A[i]] == 0) {
            total ++;
            leaves [A[i]] = 1;
        }
        if (total == X) return i;
    }
    return -1;
}



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
    int time = -1;
    int unique = 0;
    int[] set = new int[X + 1];
    for (int i = 0; i < A.length; i++) {
        if (set[A[i]] == 0 && A[i] <= X) {
            unique++;
            set[A[i]]++;
        }
        if (unique == X) {
            return i;
        }
    }
    return time;
}



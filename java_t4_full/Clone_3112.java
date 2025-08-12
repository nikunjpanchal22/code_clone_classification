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
    int time = -1;
    boolean [] check = new boolean[X+1];
    Arrays.fill(check, Boolean.FALSE);
    for (int x = 0; x < A.length; x++) {
        if (A[x] <= X && !check[A[x]]) {
            check[A[x]] = true;
        }
        if (!Arrays.asList(check).contains(false)) {
            time = x;
            break;
        }
    }
    return time;
}



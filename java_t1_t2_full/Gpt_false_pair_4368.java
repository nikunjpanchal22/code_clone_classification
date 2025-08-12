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
    int size = A.length;
    int [] check = new int [X];
    int cnt = 0;
    int time = - 1;
    for (int x = 0; x < size; x ++) {
        int val = A [x];
        if (val <= X) {
            if (check [val - 1] > 0) continue;
            check [val - 1] ++;
            cnt ++;
        }
        if (cnt == X) {
            time = x;
            break;
        }
    }
    return time;
}

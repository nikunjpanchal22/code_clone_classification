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
    int size = A.length;
    int[] check = new int[X];
    int cmp = 0;
    int time = -1;
    for (int x = 0; x < size; x++) {
        int temp = A[x];
        if (temp <= X && check[temp - 1] == 0) {
            check[temp - 1] += 1;
            cmp += 1;
            if (cmp == X) {
                time = x;
                break;
            }
        }
    }
    return time;
}



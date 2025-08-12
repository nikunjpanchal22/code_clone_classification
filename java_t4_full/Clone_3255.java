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
    int[] counter = new int[X];
    int sum = 0;
    for (int i = 0; i < A.length; i++) {
        if (counter[A[i]-1] == 0) {
            counter[A[i]-1]++;
            sum++;
            if(sum == X) return i;
        }
    }
    return -1;
}



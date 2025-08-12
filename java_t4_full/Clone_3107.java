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
    int[] counters = new int[X+1];
    int tot = 1;
    for(int i = 1; i < X; i++) {
        tot += (i+1);
        counters[i] = -1;
    }	
    counters[X] = -1;
    int sum = 0, i = 0;
    for(i = 0; i < A.length; i++) {
        if (counters[A[i]] == -1) {
            counters[A[i]] = i;
            sum += A[i];
            if(sum == tot) {
                return i;
            }
        }
    }
    return -1;
}



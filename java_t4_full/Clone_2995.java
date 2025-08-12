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
    int jumps = X;
    int mo = new int[X+1];
    for(int i=0;i<X;i++) {
        if(mo[A[i]] == 0) {
            mo[A[i]] = 1;
            jumps--;
        }
        if(jumps == 0) return i;
    }
    return -1;
}



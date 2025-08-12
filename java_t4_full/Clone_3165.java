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
    int[] flagArray = new int[X];
    int timeElapsed;
    int total = 0;

    for(timeElapsed = 0; timeElapsed < A.length; timeElapsed++){
        if(flagArray[A[timeElapsed]-1] == 0){
            flagArray[A[timeElapsed]-1] = A[timeElapsed];
            total += A[timeElapsed];
            if(total == (X*(X+1))/2) return timeElapsed;
        }
    }
    return -1;
}



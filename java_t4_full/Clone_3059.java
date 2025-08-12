public int solution (int X, int [] A) {
    int len = A.length;
    if (X > len) {
        return - 1;
    }
    int [] isFilled = new int [X];
    int jumped = 0;
    Arrays.fill (isFilled, 0);
    for (int i = 0;
    i < len; i ++) {
        int x = A [i];
        if (x <= X) {
            if (isFilled [x - 1] == 0) {
                isFilled [x - 1] = 1;
                jumped += 1;
                if (jumped == X) {
                    return i;
                }
            }
        }
    }
    return - 1;
}



 

public int solution(int X, int[] A) {
    int[] record = new int[X];
    int expectedSum = (1+X) * X / 2;
    int sum = 0;
    for(int sec = 0; sec < A.length; sec++){
        int pos = A[sec];
        if (pos <= X && record[pos-1] == 0){
            record[pos-1] = pos;
            sum += pos;
            if(sum == expectedSum) return sec;
        }
    }
    return -1;
}



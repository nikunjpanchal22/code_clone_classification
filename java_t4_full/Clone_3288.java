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
    int size = A.length;
    int[] fillArr = new int[X];
    int totalJumps = 0;
    for (int i = 0; i < size; i++) {
        if (A[i] <= X && fillArr[A[i]-1] == 0) {
            fillArr[A[i]-1] = 1;
            totalJumps++;
            if (totalJumps == X)
                return i;
        }
    }
    return -1;
}



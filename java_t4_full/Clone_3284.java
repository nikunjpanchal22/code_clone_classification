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
    int total = A.length;
    if (X > total)
        return - 1;
    
    int[] required = new int[X];
    int jumps = 0;
    for (int i = 0; i < total; i++) {
        if (A[i] <= X && required[A[i]-1] == 0) {
            required[A[i]-1] = 1;
            jumps++;
            if (jumps == X)
                return i;
        }
    }
    return -1;
}



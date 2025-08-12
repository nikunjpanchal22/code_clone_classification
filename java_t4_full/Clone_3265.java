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




public int solution (int X, int [] A) {
    int jumps = -1;
    int[] isJump = new int[X+1];
    int sum = 0;
    for (int i = 0; i < A.length; i++) {
        if (A[i] <= X && isJump[A[i]] == 0) {
            isJump[A[i]] = 1;
            sum++;
            if (sum == X){
                return i;
            }
        }
    }
    return jumps;
}



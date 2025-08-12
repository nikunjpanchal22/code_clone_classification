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
    int N = A.length;
    int[] pos = new int[X];
    int missing = X;
    for (int i = 0; i < N; i++) {
        if (pos[A[i] - 1] == 0) {
            pos[A[i] - 1] = i + 1;
            missing--;
        }
        if (missing == 0)
            return i;
    }
    return -1;
}



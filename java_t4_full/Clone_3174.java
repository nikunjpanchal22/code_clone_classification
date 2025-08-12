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
    int jumps = 0, time = -1;
    int[] filled = new int[X];
    for (int i = 0; i < A.length; i++) {
        int a = A[i];
        if (a <= X && filled[a - 1] == 0) {
            filled[a - 1] = 1;
            jumps++;
            if (jumps == X) {
                time = i;
                break;
            }
        }
    }
    return time;
}



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
    if (X > N) {
        return -1;
    }
    int[] check = new int[X];
    int cover = 0;
    for (int i = 0; i < N; i++) {
        if (check[A[i] - 1] == 0) {
            check[A[i] - 1] = 1;
            cover++;
            if (cover == X) {
                return i;
            }
        }
    }
    return -1;
}



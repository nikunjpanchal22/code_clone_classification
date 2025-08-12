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
    int[] arr = new int[X];
    int req = X;
    for (int i = 0; i < A.length; i++) {
        if (arr[A[i] - 1] == 0) {
            arr[A[i] - 1]++;
            req--;
        }
        if (req == 0)
            return i;
    }
    return -1;
}



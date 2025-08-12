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
    HashSet<Integer> set = new HashSet<>();
    int jumps = 0;
    if (X > A.length) {
        return -1;
    }
    for (int i = 0; i < A.length; i++) {
        if (A[i] <= X && !set.contains(A[i])) {
            jumps++;
            set.add(A[i]);
        }
        if (jumps == X) {
            return i;
        }
    }
    return -1;
}



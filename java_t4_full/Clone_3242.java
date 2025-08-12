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
    int[] visited = new int[X + 1];
    int left = X;

    for (int i = 0; i < A.length; i++) {
        if (visited[A[i]] == 0) {
            visited[A[i]]++;
            left--;
            if (left == 0)
                return i;
        }
    }

    return -1;
}



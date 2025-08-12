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
    int[] holder = new int[X];
    int count = 0;
    for (int i = 0; i < A.length; i++) {
        if (holder[A[i] - 1] == 0) {
            holder[A[i] - 1] = 1;
            count++; 
            if (count == X) {
                return i;
            }
        }
    }
    return -1;
}



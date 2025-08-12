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
    int len = A.length;
    int result = -1;
    if (len >= X) {
        int [] isFilled = new int[X];
        int r = 0;
        for (int i = 0; i < len; i++) {
            int jumpIndex = A[i] - 1;
            if(jumpIndex < X && isFilled[jumpIndex] == 0) {
                isFilled[jumpIndex] = 1;
                r++;
            }
            if(r == X) {
                result = i;
                break;
            }
        }
    }
    return result;
}



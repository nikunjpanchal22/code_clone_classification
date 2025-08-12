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
    if (X > len) {
        return - 1;
    }
    // create an array of booleans to mark which values were found in the array A
    boolean[] marked = new boolean[X];
    int jumped = 0;
    for (int i = 0; i < len; i++) {
        int x = A[i];
        if (x <= X) {
            // if value x was never marked set it to true otherwise continue
            // the loop
            if (!marked[x - 1]) {
                marked[x - 1] = true;
                jumped += 1;
                if (jumped == X) {
                    return i;
                }
            }
        }
    }
    return - 1;
}



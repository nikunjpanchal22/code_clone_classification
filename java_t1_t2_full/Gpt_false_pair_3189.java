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
    int size = A.length;
    if (X > size) {
        return - 1;
    }
    int [] isFilled = new int [X];
    int jumped = 0;
    Arrays.fill (isFilled, 0);
    for (int i = 0;
    i < size; i ++) {
        int value = A [i];
        if (value <= X) {
            if (isFilled [value - 1] == 0) {
                isFilled [value - 1] = 1;
                jumped++;
                if (jumped == X) {
                    return i;
                }
            }
        }
    }
    return - 1;
}

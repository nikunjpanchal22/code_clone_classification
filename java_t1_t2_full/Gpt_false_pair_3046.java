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


public int solution (int Y, int [] B) {
    int len = B.length;
    if (Y > len) {
        return - 1;
    }
    int [] isFilled = new int [Y];
    int jumped = 0;
    Arrays.fill (isFilled, 0);
    for (int i = 0;
        i < len; i ++) {
        int y = B [i];
        if (y <= Y) {
            if (isFilled [y - 1] == 0) {
                isFilled [y - 1] = 1;
                jumped += 1;
                if (jumped == Y) {
                    return i;
                }
            }
        }
    }
    return - 1;
}

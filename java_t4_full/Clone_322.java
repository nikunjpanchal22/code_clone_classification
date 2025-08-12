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
    if (X > A.length) 
        return - 1;
    int [] isFilled = new int [X];
    fillArray(isFilled);
    int c = 0;
    for (int num : A) {
        if (num <= X) {
            if (isFilled[num - 1] == 0) {
                isFilled[num - 1] = 1;
                c += 1;
                if (c == X) return num;
            }
        }
    }
    return - 1;
}



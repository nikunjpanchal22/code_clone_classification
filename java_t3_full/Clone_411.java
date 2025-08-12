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
        BitSet bitSet = new BitSet(X);
        int jumped = 0;
        for (int i = 0; i < len; i ++) {
            int x = A [i];
            if (x <= X) {
                if (!bitSet.get(x - 1)) {
                    bitSet.set(x - 1);
                    jumped += 1;
                    if (jumped == X) {
                        return i;
                    }
                }
            }
        }
        return - 1;
}



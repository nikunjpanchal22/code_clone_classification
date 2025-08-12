public static int solution (int X, int [] A) {
    int [] counter = new int [X + 1];
    int ans = - 1;
    int x = 0;
    for (int i = 0;
    i < A.length; i ++) {
        if (counter [A [i]] == 0) {
            counter [A [i]] = A [i];
            x += 1;
            if (x == X) {
                return i;
            }
        }
    }
    return ans;
}



public static int solution (int X, int [] A) {
    boolean[] seen = new boolean[X + 1];
    int left = X;
    for (int i = 0; i < A.length; i ++) {
        if (!seen [A [i]]) {
            seen [A [i]] = true;
            left--;
            if (left == 0) {
                return i;
            }
        }
    }
    return -1;
}



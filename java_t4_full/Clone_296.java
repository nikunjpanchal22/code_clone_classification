public static int solution (int X, int [] A) {
    int [] count = new int [X];
    for (int i = 0;
    i < A.length; i ++) {
        try {
            count [A [i] - 1] ++;
        } catch (ArrayIndexOutOfBoundsException e) {
        }
        if (i >= X - 1) {
            for (int j = 0;
            j < count.length; j ++) {
                if (count [j] == 0) {
                    break;
                }
                if (j == count.length - 1) {
                    return i;
                }
            }
        }
    }
    return - 1;
}



 public static int solution (int x, int [] A){
    boolean[] seen = new boolean[x];
    for (int i = 0; i < A.length; i++) {
        if (A[i] <= x) {
            seen[A[i] - 1] = true;
            int j = 0;
            while (j < seen.length) {
                if (!seen[j]) {
                    break;
                }
                if (j == seen.length - 1) {
                    return i;
                }
                j++;
            }
        }
    }
    return -1;
}



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


 public static int solution (int x, int [] A) {
    int[] count = new int[x];
    int numFilled = 0;
    for (int i = 0; i < A.length; i++) {
        if (A[i] <= x) {
            count[A[i] - 1]++;
            if (count[A[i] - 1] == 1) {
                numFilled++;
            }
        }
        if (i >= x - 1 && numFilled == x) {
            return i;
        }
    }
    return -1;
}



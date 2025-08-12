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
    int[] countArray = new int[x];
    for (int i = 0; i < A.length; i++) {
        if (A[i] > x) {
            continue;
        }
        countArray[A[i] - 1]++;
        int count = 0;
        for (int j = 0; j < x; j++) {
            if (countArray[j] == 0) {
                break;
            }
            if (j == x - 1) {
                count = 1;
            }
        }
        if (count == 1) {
            return i;
        }
    }
    return -1;
}



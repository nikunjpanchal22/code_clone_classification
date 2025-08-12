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
    for(int i = 0; i < A.length; i++) {
        if(A[i] <= x)
            count[A[i] - 1]++;
        if(i >= x - 1) {
            int j = 0;
            while (j < x) {
                if(count[j] == 0)
                    break;
                if(j == x - 1)
                    return i;
                j++;
            }
        }
    }
    return -1;
}



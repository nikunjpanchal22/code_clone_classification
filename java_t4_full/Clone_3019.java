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





public static int solution(int X, int[] A) {
        int[] arr = new int[X];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0 && A[i] <= X) {
                arr[A[i] - 1] = 1;
            }
            if (checkArray(arr)) {
                return i;
            }
        }
        return -1;
    }
    private static boolean checkArray(int [] arr) {
        for (int i : arr) {
            if (i == 0) return false;
        }
        return true;
}



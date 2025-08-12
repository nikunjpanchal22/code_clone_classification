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
    int sum = 0, index = -1;
    int[] check = new int[100001];
    for (int i = 0; i < A.length; i++) {
        if (check[A[i] - 1] == 0) {
            check[A[i] - 1] = 1;
            sum++;
        }
        if (sum == X) {
            index = i;
            break;
        }
    }
    return index;
}



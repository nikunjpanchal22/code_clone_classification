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
    int[] indexes = new int[X+1];
    int max = -1;
    for (int i = 0; i < A.length; i++)
    {
        if (indexes[A[i]] == 0 && A[i] <= X)
            indexes[A[i]] = i+1;

        if (indexes[A[i]] > max)
            max = indexes[A[i]];
    }
    for (int i = 1; i <= X; i ++)
        if (indexes[i] == 0)
            return -1;
    return max-1;
}



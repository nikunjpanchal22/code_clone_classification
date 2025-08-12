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




public static int solution(int X, Integer[] A) {
    int[] count = new int[X];
    return IntStream.range(0, A.length)
        .peek(i -> count[Math.max(0, Math.min(X, A[i]) - 1)]++)
        .filter(i -> IntStream.range(0, X).allMatch(x -> count[x] > 0))
        .findFirst()
        .orElse(-1);
}



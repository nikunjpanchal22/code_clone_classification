static int findMIN (int [] A, int c) {
    int x = A [c];
    int position = c;
    while (c < A.length) {
        if (x > A [c]) {
            x = A [c];
            position = c;
        }
        c ++;
    }
    return position;
}





static int findMIN (int [] A, int c) {
    return Arrays.stream(A, c, A.length)
            .mapToObj(i -> i)
            .min(Integer::compareTo)
            .orElse(A[c]);
}



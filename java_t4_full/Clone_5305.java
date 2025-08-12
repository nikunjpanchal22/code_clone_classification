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
    return IntStream.range(c, A.length)
            .reduce((i, j) -> A[i] > A[j] ? j : i)
            .getAsInt();
}



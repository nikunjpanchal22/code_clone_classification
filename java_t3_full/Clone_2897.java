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
    int minValue = Integer.MAX_VALUE;
    int minIndex = c;
    for (int i = c; i < A.length; i++) {
        if (A[i] < minValue) {
            minValue = A[i];
            minIndex = i;
        }
    }
    return minIndex;
}



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
    int x = A[c];
    int position = c;
    for (int idx = c; idx < A.length; idx++) {
        if (x > A[idx]) {
            x = A[idx];
            position = idx;
        }
    }
    return position;
}

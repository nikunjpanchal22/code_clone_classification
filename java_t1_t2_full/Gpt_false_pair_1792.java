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
    for (int count = c; count < A.length; count++) {
        if (x > A[count]) {
            x = A[count];
            position = count;
        }
    }
    return position;
}

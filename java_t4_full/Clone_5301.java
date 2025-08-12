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
    int min = c;
    for (int i = c+1; i < A.length; i++) {
        min = A[i] < A[min] ? i : min;
    }
    return min;
}



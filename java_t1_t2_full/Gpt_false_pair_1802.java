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
    int x = A [c];
    int position = c;
    int i = c;
    while (i < A.length) {
        if (x > A [i]) {
            x = A [i];
            position = i;
        }
        i ++;
    }
    return position;
}

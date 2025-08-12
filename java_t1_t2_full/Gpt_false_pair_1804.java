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
    int i;
    for(i=c; i<A.length; i++) {
        if (x > A [i]) {
            x = A [i];
            position = i;
        }
    }
    return position;
}

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
    int pos = c;
    for ( ;c < A.length; c++) {
        if (A[c]<x) {
            x = A[c];
            pos=c;
        }
    }
    return pos;
}



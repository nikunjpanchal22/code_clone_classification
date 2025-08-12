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
    while (true) {
        if (c <= A.length-1) {
            if (x > A [c]) {
                x = A [c];
                position = c;
               }
            c ++;
        }
        else {
            break;
        }
    }
    return position;
}



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



static int findMIN (int [] A) {
    int min = A[0];
    int position = 0;
    int count = 0;
    for(int num : A){
        if(num < min){
            min = num;
            position = count;
        }
        count++;
    }
    return position;
}



public int solution (int X, int [] A) {
    int len = A.length;
    if (X > len) {
        return - 1;
    }
    int [] isFilled = new int [X];
    int jumped = 0;
    Arrays.fill (isFilled, 0);
    for (int i = 0;
    i < len; i ++) {
        int x = A [i];
        if (x <= X) {
            if (isFilled [x - 1] == 0) {
                isFilled [x - 1] = 1;
                jumped += 1;
                if (jumped == X) {
                    return i;
                }
            }
        }
    }
    return - 1;
}


 

public int solution (int X, int [] A) {
    int N = A.length;
    int [] B = new int[X+1];
    int sum = 0;
    for(int i=1; i<=X; i++){
        B[i] = -1;
    }
    for(int i=0; i<N; i++){
        if(B[A[i]] == -1){
            B[A[i]] = i;
            sum++;
        }
        if(sum==X){
            return i;
        }
    }
    return -1;
}



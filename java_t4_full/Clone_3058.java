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


 

public int solution(int X, int [] A) {
    int [] B = new int[X];
    Arrays.fill(B, 0);
    int sum =0;
    int r = 0;
    for(int i=0; i<A.length; i++){
        if(A[i]<=X && B[A[i]-1]==0){
            B[A[i]-1]=A[i];
            sum+=A[i];
            r=i;
            if(sum==((X*(X+1))/2))return r;
        }
    }
    return -1;
}



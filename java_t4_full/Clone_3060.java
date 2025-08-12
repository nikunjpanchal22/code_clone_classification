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
        int len = A.length;
        return X > len ? -1 : bitMaskSolution (X, A, len, new int [X], 0);
    }
    private int bitMaskSolution (int X, int [] A, int len, int[] isFilled, int jumped) {
        Arrays.fill(isFilled, 0);
        for(int i=0; i<len; i++){
            int x = A[i];
            if(x<=X){
                isFilled[x - 1] = isFilled[x - 1] == 0 ?  addJump(isFilled, x, jumped, i, X) : 1;
            }
        }
        return -1;
    }
    private int addJump(int [] isFilled, int x, int jumped, int i, int X) {
        isFilled[x - 1] = 1;
        jumped ++;
        return jumped == X ? i : 1;
}



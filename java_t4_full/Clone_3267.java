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
    int targetSum = X*(X+1)/2;
    int currentSum = 0;
    int[] filled = new int[X+1];
    for (int i = 0; i < A.length; i++) {
        if (filled[A[i]]==0) {
            filled[A[i]]++;
            currentSum += A[i];
            if (currentSum == targetSum) return i;
        } 
    }
    return -1;
}



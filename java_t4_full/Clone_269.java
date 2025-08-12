public static int solution (int X, int [] A) {
    int [] counter = new int [X + 1];
    int ans = - 1;
    int x = 0;
    for (int i = 0;
    i < A.length; i ++) {
        if (counter [A [i]] == 0) {
            counter [A [i]] = A [i];
            x += 1;
            if (x == X) {
                return i;
            }
        }
    }
    return ans;
}



 public static int solution (int X, int [] A) {
    int index = -1;
    int[] absoluteLeftPositions = new int [X];
    for (int i = 0; i<A.length; i++){
        if(A[i] <= X ){
            if (absoluteLeftPositions[A[i]-1] == 0){
                absoluteLeftPositions[A[i]-1] = i;
                X--;
                if (X == 0) {
                    return i;
                }
            }
        }
    }
    return index;
}



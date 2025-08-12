public static int solution (int X, int [] A) {
    int [] count = new int [X];
    for (int i = 0;
    i < A.length; i ++) {
        try {
            count [A [i] - 1] ++;
        } catch (ArrayIndexOutOfBoundsException e) {
        }
        if (i >= X - 1) {
            for (int j = 0;
            j < count.length; j ++) {
                if (count [j] == 0) {
                    break;
                }
                if (j == count.length - 1) {
                    return i;
                }
            }
        }
    }
    return - 1;
}




public static int solution(int X, int[] A) {
    boolean[] leaves = new boolean[X+1];
    int leafCount = 0;
    for(int i=0; i<A.length; i++) {
        if(!leaves[A[i]]){
            leaves[A[i]] = true;
            leafCount += 1;
        }
        if(leafCount==X){
            return i;
        }
    }
    return -1;
}



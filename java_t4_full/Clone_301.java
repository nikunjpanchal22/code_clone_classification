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


 public static int solution (int x, int [] A){
    Set<Integer> visited = new HashSet<Integer>();
    for(int i=0; i<A.length; i++){
        if(A[i] <= x){
            visited.add(A[i]);
            if(visited.size() == x){
                return i;
            }
        }
    }
    return -1;
}



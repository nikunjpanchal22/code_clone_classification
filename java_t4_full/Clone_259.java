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


  public static int solution (int X, int [] A) {
    boolean[] visited = new boolean[X]; 
    int numVisited = 0; 
    for (int i = 0; i <A.length; i++) {
        try {
            if (!visited[A[i]-1]) {
                visited[A[i]-1] = true;
                numVisited ++; 
            }
        } catch (ArrayIndexOutOfBoundsException e) {}
        if (numVisited == X) {
            return i; 
        }
    }
    return -1; 
}



public int solution (int X, int [] A) {
    int size = A.length;
    int [] check = new int [X];
    int cmp = 0;
    int time = - 1;
    for (int x = 0;
    x < size; x ++) {
        int temp = A [x];
        if (temp <= X) {
            if (check [temp - 1] > 0) {
                continue;
            }
            check [temp - 1] ++;
            cmp ++;
        }
        if (cmp == X) {
            time = x;
            break;
        }
    }
    return time;
}




public int solution(int X, int[] A) {
    Boolean[] leaf = new Boolean[X+1];
    int counter = 0;
    Integer result = -1;
    for (int i = 0; i < A.length; i++) {
        if(A[i]<= X && leaf[A[i]] == null) {
            leaf[A[i]] = true;
            counter++;
        }
        if(counter == X){
            result = i;
            break;
        }
    }
    return result;
}



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


 public int solution(int X, int[] A){
    int N = A.length;
    boolean[] boolArr = new boolean[X + 1];// boolArr[0] won't be used 
    int time = -1;
    int i = 0;
    while (i < N) {
        int v = A[i];
        if (v <= X && boolArr[v] == false) {
            boolArr[v] = true;
            X--;
        }
        if (X == 0) time = i; 
        i++;
    }
    return time;
}



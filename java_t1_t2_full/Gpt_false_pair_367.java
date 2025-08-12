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
    int size = A.length;
    int[] isFound = new int[X]; //Set all elements to 0
    int count = 0;
    int time = -1;
    for (int i = 0; i < size; i++) {
        int temp = A[i];
        if (temp <= X && isFound[temp-1] == 0) {
            isFound[temp-1]++;
            count++;
            if (count == X) {
                time = i;
                break;
            }
        }
    }
    return time;
}

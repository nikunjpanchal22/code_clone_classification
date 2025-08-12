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
    int[] tempArray = new int[X];
    int count = 0;
    int index = -1;
    for (int i = 0; i < A.length; i++) {
        if (A[i] <= X && tempArray[A[i] - 1] == 0) {
            tempArray[A[i] - 1] = A[i];
            count++;
        }
        if (count == X) {
            index = i;
            break;
        }
    }
    return index;
}



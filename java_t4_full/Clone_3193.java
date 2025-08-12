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




public int solution (int X, int[] A) {
    int[] arr = new int[X];
    int index = -1;
    boolean flag = false;
    for (int i=0; i<A.length; i++) {
        if (A[i] <= X && arr[A[i]-1] == 0) {
            arr[A[i]-1] = A[i];
            flag = true;
            for (int value : arr) {
                if (value == 0) {
                    flag = false;
                }
            }
            if (flag) {
                index = i;
                break;
            }
        }
    }
    return index;
}



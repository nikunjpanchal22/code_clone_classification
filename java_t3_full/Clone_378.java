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
    Boolean[] check = new Boolean[X];
    int counter = 0;
    int result =-1;

    for (int j = 0; j < size; j++) {
        int tempElement = A[j];
        if (tempElement <= X && check[tempElement-1] == false) {
            counter++;
            check[tempElement-1] = true;
            if (counter == X) {
                result = j;
                break;
            }
        }
    }
    return result;
}



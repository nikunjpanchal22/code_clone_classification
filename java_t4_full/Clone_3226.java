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
    int counter = 0, time = -1;
    int[] check = new int[X];
    for(int i = 0; i < A.length; i++) {
      if(A[i] <= X) {
        if(check[A[i]-1] == 0) {
          counter++;
          check[A[i]-1]++;
        }
        if(counter == X) {
          time = i;
          break;
        }
      }
    }
    return time;
}



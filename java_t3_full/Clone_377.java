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
    boolean[] checked = new boolean[X]; 
    int currentCounter = 0; 
    int time = -1; 
    for (int x = 0; x < size; x++) { 
      int tempElement = A[x]; 
      if (tempElement <= X && checked[tempElement - 1] == false) { 
        checked[tempElement - 1] = true; 
        currentCounter++; 
      } 
      if (currentCounter == X) { 
        time = x; 
        break; 
      }
    }
    return time;
}



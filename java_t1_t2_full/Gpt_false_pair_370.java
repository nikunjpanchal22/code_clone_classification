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
    int[] foundValues = new int[X];
    int counter = 0;
    int result = -1; 
    
    for (int i = 0; i < size; i++) {
        int num = A[i]; 
        if (num <= X && foundValues[num - 1] == 0) { 
            foundValues[num - 1]++; 
            counter++; 
        } 
        if (counter == X) { 
            result = i;
            break;
        }
    }
    return result;
}

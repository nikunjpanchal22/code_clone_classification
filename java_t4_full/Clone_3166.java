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
    int sum=0;
    int totalSum=(X*(X+1))/2;
    for(int i=0; i<A.length;i++){
        if(tempArray[A[i]-1]==0){
            tempArray[A[i]-1]=A[i];
            sum+=A[i];
            if(sum==totalSum) return i;
        }
    }
    return -1;
}



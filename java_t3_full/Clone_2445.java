public static int solution (int X, int [] A) {
    int [] counter = new int [X + 1];
    int ans = - 1;
    int x = 0;
    for (int i = 0;
    i < A.length; i ++) {
        if (counter [A [i]] == 0) {
            counter [A [i]] = A [i];
            x += 1;
            if (x == X) {
                return i;
            }
        }
    }
    return ans;
}




public static int solution(int X, int [] A) {
    int slots_filled = 0;
    int[] slots = new int[X+1];
    for(int i = 0; i < A.length; i++){
        if(slots[A[i]] == 0){
            slots_filled++;
            slots[A[i]] = i+1;
            if(slots_filled == X){
                return i;
            }
        }
    }
    return -1;
}



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




public int solution (int X, int [] A) {
    int position [] = new int [X+1];
    int Xposition = 0;
    for(int i = 0; i < A.length; i++) {
        if(A[i]<=X && position[A[i]]==0) {
            position[A[i]]=1;
            Xposition++;
            if(Xposition==X) return i;
        }
    }
    return -1;
}



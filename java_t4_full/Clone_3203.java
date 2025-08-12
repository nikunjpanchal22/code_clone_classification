public int solution (int X, int [] A) {
    int len = A.length;
    if (X > len) {
        return - 1;
    }
    int [] isFilled = new int [X];
    int jumped = 0;
    Arrays.fill (isFilled, 0);
    for (int i = 0;
    i < len; i ++) {
        int x = A [i];
        if (x <= X) {
            if (isFilled [x - 1] == 0) {
                isFilled [x - 1] = 1;
                jumped += 1;
                if (jumped == X) {
                    return i;
                }
            }
        }
    }
    return - 1;
}





public <T> int solution(T X, T[] A){
    int len=A.length;
    if((int)X>len){
        return -1;
    }
    T[] isFilled= (T[]) new Object[(int)X];
    int jumped=0;
    Arrays.fill(isFilled,0);
    for(T x: A){
        if((int)x<=(int)X){
            if((int)isFilled[(int)x-1]==0){
                isFilled[(int)x-1]=(T)Integer.valueOf(1);
                jumped+=1;
                if(jumped==(int)X){
                    return (int)x;
                }
            }
        }
    }
    return -1;
}



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


 public static int solution (int X, int [] A) {
    int result = -1;
    boolean[] indices=new boolean[X+1];
    int foundXs=0;
    for(int i=0; i<A.length; i++){
        if(!indices[A[i]]){
            indices[A[i]]=true;
            foundXs++;
            if(foundXs==X) {
                result=i;
                break;
            }
        }
    }
    return result;
}



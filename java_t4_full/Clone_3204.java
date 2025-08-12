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





public int solution(int X, int[] A) {
    Map<Integer,Integer> map=new HashMap<>();
    int jump=0;
    for(int i=0;i<A.length;i++){
        if(map.get(A[i])==null && A[i]<=X){
            map.put(A[i],A[i]);
            jump++;
            if(jump==X)
                return i;
        }
    }
    return -1;
}



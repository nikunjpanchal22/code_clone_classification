public int solution (int X, int [] A) {
    Set < Integer > leaves = new HashSet < > ();
    for (int i = 0;
    i < A.length; i ++) {
        leaves.add (A [i]);
        if (leaves.contains (X) && leaves.size () == X) return i;
    }
    return - 1;
}





public int solution(int X, int[] A) {
    boolean[] leaves = new boolean[X+1];
    int sum = X;

    for(int i=0;i<A.length;i++){
        if(!leaves[A[i]]){
            leaves[A[i]]=true;
            sum--;
            if(sum==0) return i;
        }
    }
    return -1;
}



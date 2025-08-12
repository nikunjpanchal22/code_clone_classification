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
    int arr[] = new int[X+1];
    int sum = 0;
    for(int i=0; i<A.length; i++){
        if(arr[A[i]] == 0){
            arr[A[i]] = 1;
            sum ++;
            if(sum == X){
                return i;
            }
        }
    }
    return -1;
}



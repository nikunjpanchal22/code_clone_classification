public int solution (int [] A) {
    int [] mark = new int [A.length + 1];
    int counter = 0;
    for (int i = 0;
    i < A.length; ++ i) {
        int value = A [i];
        if (value >= mark.length) {
            return NOT_PERMUTATION;
        }
        if (mark [value] == 0) {
            mark [value] = 1;
            ++ counter;
        } else {
            return NOT_PERMUTATION;
        }
    }
    return counter == A.length ? PERMUTATION : NOT_PERMUTATION;
}






public int solution(int [] A) {
    for(int i=0; i < A.length; i++){
        boolean found = false;
        for(int j=i+1; j< A.length; j++){
            if(A[j] == A[i]){
                return NOT_PERMUTATION;
            }
        }
    }
    return PERMUTATION;
}



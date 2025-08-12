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






public int solution (int [] A) {
    ArrayList<Integer> list = new ArrayList<>();
    for (int i : A){
        if(i > A.length || list.contains(i)){
            return NOT_PERMUTATION;
        }
        list.add(i);
    }
    return list.size() == A.length ? PERMUTATION : NOT_PERMUTATION;
}



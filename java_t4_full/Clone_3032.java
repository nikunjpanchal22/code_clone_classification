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
    Set<Integer> uniqueNums = new HashSet<>();
    for (int index=0; index<A.length; index++){
        if (uniqueNums.add(A[index]) && X == uniqueNums.size()) {
            return index;
        }
    }
    return -1;
}



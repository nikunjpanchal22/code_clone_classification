public static int solution (int X, int [] A) {
    int [] count = new int [X];
    for (int i = 0;
    i < A.length; i ++) {
        try {
            count [A [i] - 1] ++;
        } catch (ArrayIndexOutOfBoundsException e) {
        }
        if (i >= X - 1) {
            for (int j = 0;
            j < count.length; j ++) {
                if (count [j] == 0) {
                    break;
                }
                if (j == count.length - 1) {
                    return i;
                }
            }
        }
    }
    return - 1;
}


  public static int solution (int X, int [] A) {
    HashSet<Integer> set = new HashSet<>(); 
    for (int i = 0; i < A.length; i++) {
        try {
            if (!set.add(A[i]-1)) {
                set.remove(A[i] - 1);
            }
        } catch (ArrayIndexOutOfBoundsException e) {}
        if (set.size() == 0) {
            return i;
        }
    }
    return -1; 
}



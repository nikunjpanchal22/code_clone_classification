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
    int ans = -1;
    boolean[] found = new boolean[X+1];
    int x = 0;
    for (int i = 0; i < A.length; i++) {
        if (found[A[i]] == false) {
            found[A[i]] = true;
            x++;
            if (x == X) {
              return i;
            }
       }
    }
    return ans;
}



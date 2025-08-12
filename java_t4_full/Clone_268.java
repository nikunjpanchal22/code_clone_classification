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
    int[] markers = new int[X];
    int xTotal = 0;
    int ans = -1;
    for (int i = 0; i < A.length; i++) {
        if (markers[A[i]-1] == 0) {
            markers[A[i]-1] = A[i];
            xTotal++;
            if (xTotal == X) {
                ans = i;
                break;
            }
        }
    }
    return ans;
}



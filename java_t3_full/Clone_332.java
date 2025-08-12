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
    int [] indices = new int [X + 1];
    int numberOfXs = 0;
    for (int i = 0; i < A.length; i ++) {
        if (indices [A [i]] == 0) {
            indices [A [i]] = 1;
            numberOfXs += 1;
            if (numberOfXs == X) {
                ans = i;
                break;
            }
        }
    }
    return ans;
}



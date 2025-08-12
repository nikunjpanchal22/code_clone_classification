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
    int [] num = new int [X + 1];
    int total = 0;
    for (int cnt = 0; cnt < A.length; cnt ++) {
        if (num[A[cnt]] == 0) {
            num[A[cnt]] = 1;
            total++;
            if (total == X) return cnt;
        }
    }
    return -1;
}



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




public static int solution(int X, int[] A) {
    int[] time = new int[X + 1];
    Arrays.fill(time, -1);
    for (int i = 0; i < A.length; i++) {
        if (time[A[i]] == -1) time[A[i]] = i;
    }
    Arrays.sort(time);
    return time[0] == -1 ? -1 : time[X];
}



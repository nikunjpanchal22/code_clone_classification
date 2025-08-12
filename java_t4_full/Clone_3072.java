public int solution (int X, int [] A) {
    Set < Integer > set = new HashSet < Integer > ();
    int sum1 = 0, sum2 = 0;
    for (int i = 0;
    i <= X; i ++) {
        sum1 += i;
    }
    for (int i = 0;
    i < A.length; i ++) {
        if (set.contains (A [i])) continue;
        set.add (A [i]);
        sum2 += A [i];
        if (sum1 == sum2) return i;
    }
    return - 1;
}





public int solution(int X, int[] A) {
    int[] count = new int[X + 1];
    int remaining = X;

    for (int i = 0; i < A.length; i++) {
        int num = A[i];
        if (count[num] == 0) {
            if (num <= X) remaining--;
            count[num]++;
            if (remaining == 0) return i;
        }
    }
    return -1;
}



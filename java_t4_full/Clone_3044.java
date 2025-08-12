public int solution (int X, int [] A) {
    HashSet < Integer > hset = new HashSet < Integer > ();
    for (int i = 0;
    i < A.length; i ++) {
        if (A [i] <= X) hset.add (A [i]);
        if (hset.size () == X) return i;
    }
    return - 1;
}



 

public int solution(int X, int[] A) {
    int[] count = new int[X+1];
    int sum = 0;
    for (int i = 0; i < A.length; i++) {
        if (count[A[i]] == 0) {
            sum += A[i];
            count[A[i]] = 1;
            if (sum == (X * (X + 1)) / 2) return i;
        }
    }
    return -1;
}



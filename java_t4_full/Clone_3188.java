public int solution (int X, int [] A) {
    HashSet < Integer > hset = new HashSet < Integer > ();
    for (int i = 0;
    i < A.length; i ++) {
        if (A [i] <= X) hset.add (A [i]);
        if (hset.size () == X) return i;
    }
    return - 1;
}




public int solution(int X, int [] A) {
    int[] positions = new int[X + 1];
    Arrays.fill(positions, -1);
    for (int i = 0; i < A.length; i++) {
        positions[A[i]] = Math.max(positions[A[i]], i);
    }
    int earliest = 0;
    for (int i = 1; i <= X; i++)
        earliest = Math.max(earliest, positions[i]);
    return earliest;
}



public int solution (int X, int [] A) {
    HashSet < Integer > hset = new HashSet < Integer > ();
    for (int i = 0;
    i < A.length; i ++) {
        if (A [i] <= X) hset.add (A [i]);
        if (hset.size () == X) return i;
    }
    return - 1;
}





public int solution (int X, int [] A) {
    int[] visited = new int[X+1];
    int uniqueElements = 0;
    for (int i = 0; i < A.length; i++) {
        if (++visited[A[i]] == 1 && A[i] <= X) uniqueElements++;
        if (uniqueElements == X) return i;
    }
    return -1;
}



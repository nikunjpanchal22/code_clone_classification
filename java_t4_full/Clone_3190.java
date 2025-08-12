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
    Set<Integer> requiredLeaves = IntStream.rangeClosed(1, X).boxed().collect(Collectors.toSet());
    for (int i = 0; i < A.length; i++) {
        requiredLeaves.remove(A[i]);
        if (requiredLeaves.isEmpty()) return i;
    }
    return -1;
}



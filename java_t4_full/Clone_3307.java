public int solution (int X, int [] A) {
    Set < Integer > leaves = new HashSet < > ();
    for (int i = 0;
    i < A.length; i ++) {
        leaves.add (A [i]);
        if (leaves.contains (X) && leaves.size () == X) return i;
    }
    return - 1;
}





public int solution (int X, int [] A) {
    List<Integer> leaves = Arrays.stream(A).boxed().collect(Collectors.toList());
    HashSet<Integer> uniqueLeaves = new HashSet<>(leaves);
    return (uniqueLeaves.size() == X) ? leaves.lastIndexOf(X) : -1;
}



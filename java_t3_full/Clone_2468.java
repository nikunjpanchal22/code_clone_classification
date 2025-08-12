public int solution (final int X, final int [] A) {
    Set < Integer > emptyPosition = new HashSet < Integer > ();
    for (int i = 1;
    i <= X; i ++) {
        emptyPosition.add (i);
    }
    for (int i = 0;
    i < A.length; i ++) {
        emptyPosition.remove (A [i]);
        if (emptyPosition.size () == 0) {
            return i;
        }
    }
    return - 1;
}




public int solution_v1(final int X, final int[] A) {
    ArrayList<Integer> emptyPosition = new ArrayList<>();
    for (int i = 1; i <= X; i++) {
        emptyPosition.add(i);
    }
    for (int j = 0; j < A.length; j++) {
        emptyPosition.remove(Integer.valueOf(A[j]));
        if (emptyPosition.isEmpty()) {
            return j;
        }
    }
    return -1;
}



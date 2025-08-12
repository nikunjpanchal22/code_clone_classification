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


  public int solution (final int X, final int [] A) {
    Integer[] buckets = new Integer[X + 1];
    for (int i = 0; i < A.length; i++) {
        if (buckets[A[i]] == null) {
            buckets[A[i]] = A[i];
            int j;
            for (j = 1; j < buckets.length; j++) {
                if (buckets[j] == null) {
                    break;
                }
            }
            if (j > X) {
                return i;
            }
        }
    }
    return -1;
}



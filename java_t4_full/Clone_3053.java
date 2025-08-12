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



public int solution_v2(final int X, final int[] A) {
    int[] emptyPosition = new int[X];
    int counter = 0;
    for (int i = 0; i < A.length; i++) {
        if (emptyPosition[A[i] - 1] == 0) {
            emptyPosition[A[i] - 1] = 1;
            counter++;
            if (counter == X) {
                return i;
            }
        }
    }
    return -1;
}



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



public int solution (int X, int [] A) {
    int [] emptyPosition = new int[X];
    for (int i = 0; i < X; i++) {
        emptyPosition[i] = i+1;
    }
    for (int i = 0; i < A.length; i ++) {
        if (emptyPosition[A[i]-1] != 0) {
            emptyPosition[A[i]-1] = 0;
            X--;
            if (X == 0) {
                return i;
            }
        }
    }
    return -1;
}



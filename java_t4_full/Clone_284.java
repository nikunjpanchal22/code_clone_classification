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
    boolean [] positionFilled = new boolean [X];
    int positionsRemaining = X;
    for (int i = 0;
    i < A.length; i ++) {
        if (positionFilled[A[i] - 1] == false) {
            positionFilled[A[i] - 1] = true;
            positionsRemaining--;
            if (positionsRemaining == 0) {
                return i;
            }
        }
    }
    return -1;
}



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
    int emptyPositionsRemaining = X;
    for (int i = 0;
    i < A.length; i ++) {
        emptyPositionsRemaining -= occupiedPositionSet(A[i]);
        if (emptyPositionsRemaining == 0) {
            return i;
        }
    }
    return -1;
}     

  public int solution (final int X, final int [] A) {
    Set < Integer > emptyPositions = new HashSet < Integer > ();
    int positionsNeededFilled = X;
    for (int i = 0;
    i < A.length; i ++) {
        if (!emptyPositions.contains (A[i])) {
            emptyPositions.add (A[i]);
            positionsNeededFilled--;
            if (positionsNeededFilled == 0) {
                return i;
            }
        }
    }
    return -1;
}



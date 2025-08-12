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


 public int solution (final int X, final int [] A){
    int result = -1;
    byte[] filledPosition = new byte[X+1];
    for (int i = 0; i < A.length; i++){
        if (A[i] < X+1)
            filledPosition[A[i]] = 1;
        if (checkIfAllTrue(filledPosition))
            result = i;
    }
    return result;
}



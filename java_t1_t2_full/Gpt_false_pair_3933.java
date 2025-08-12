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


public int solution (final int Y, final int [] C) {
    Set < Integer > emptyPosition = new HashSet < Integer > ();
    for (int k = 1;
    k <= Y; k ++) {
        emptyPosition.add (k);
    }
    for (int k = 0;
    k < C.length; k ++) {
        emptyPosition.remove (C [k]);
        if (emptyPosition.size () == 0) {
            return k;
        }
    }
    return - 1;
}

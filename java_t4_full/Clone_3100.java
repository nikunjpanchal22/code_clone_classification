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
    BitSet emptyPosition = new BitSet(X);
    int i = 0;
    for (int value : A) {
        if (value <= X && !emptyPosition.get(value - 1)) {
            emptyPosition.set(value - 1);
            if (--X == 0) {
                return i;
            }
        }
        i++;
    }
    return -1;
}



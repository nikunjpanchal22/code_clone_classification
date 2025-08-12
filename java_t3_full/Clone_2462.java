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
    ArrayList<Integer> track = new ArrayList<>();
    for (int i = 0; i < A.length; i++) {
        if (!track.contains(A[i]) && A[i] <= X) {
            track.add(A[i]);
            if (track.size() == X) {
                return i;
            }
        }
    }
    return -1;
}



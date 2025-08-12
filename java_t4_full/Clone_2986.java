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
    int [] track = new int[X+1];
    int count = X;
    for(int i=0; i<A.length; i++){
        if(track[A[i]] == 0){
            track[A[i]] = 1;
            count--;
        }
        if(count == 0) return i;
    }
    return -1;
}



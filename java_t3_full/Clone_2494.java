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



  

public int solution(int X, int[] A) {
    Set<Integer> requiredLeaves = new HashSet<>();
    for (int i = 1; i<=X; i++) {
        requiredLeaves.add(i);
    }
    for (int i = 0; i< A.length; i++) {
        requiredLeaves.remove(A[i]);
        if (requiredLeaves.isEmpty()) {
            return i;
        }
    }
    return -1;
}



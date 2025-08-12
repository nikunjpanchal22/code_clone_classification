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
    HashMap<Integer, Boolean> emptyPosition = new HashMap<>();
    for (int i = 1; i <= X; i++) {
        emptyPosition.put(i, false);
    }
    for (int i = 0; i < A.length; i++) {
        if (emptyPosition.containsKey(A[i])){
            emptyPosition.remove(A[i]);
        }
        if (emptyPosition.isEmpty()){
            return i;
        }
    }
    return -1;
}



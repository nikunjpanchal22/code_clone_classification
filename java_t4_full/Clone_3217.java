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
    boolean[] visited = new boolean[X + 1];
    int count = 0;
    for (int i = 0; i < A.length; ++i) {
        int value = A[i];
        if (!visited[value]) {
            visited[value] = true;
            ++count;
        }
        if (count == X) {
            return i;
        }
    }
    return -1;
}



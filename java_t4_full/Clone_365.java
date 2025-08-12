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
    int result = -1;
    int[] arr = new int[X];
    for (int i = 0; i < X; i++)
        arr[i] = 0;
    for (int i = 0; i < A.length; i++) {
        if (A[i] <= X) {
            arr[A[i] - 1] = A[i];
            result = i;
        }
    }
    for (int i = 0; i < X; i++) {
        if (arr[i] == 0)
            return -1;
    }
    return result;
}



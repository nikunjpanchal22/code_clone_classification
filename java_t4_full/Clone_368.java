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
    int ans = -1;
    boolean[] checked = new boolean[X + 1];
    for (int i =1; i < checked.length; i++)
        checked[i] = false; 
    for(int i = 0; i < A.length; i++) {
        if (A[i] <= X) { 
            if (checked[A[i]] == false) 
                checked[A[i]] = true; 
            ans = i; 
        }
    }
    for (int i = 1; i < checked.length; i++) {
        if (checked[i] == false)
            return -1;
    }
    return ans;
}



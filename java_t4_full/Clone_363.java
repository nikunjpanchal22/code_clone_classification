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
    int count = 0;
    int result = -1; 
    HashMap<Integer, Integer> map = new HashMap<>();
    if (X >= A.length) 
        return -1; 
    for (int i = 0; i < A.length; i++) {
        if (A[i] <= X && !map.containsKey(A[i])) { 
            map.put(A[i], 1);
            count++;
            if (count == X) { 
                result = i;
                break;
            }
        }
    }
    
    return result;
}



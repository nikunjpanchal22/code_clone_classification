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
	    boolean [] temp = new boolean[X + 1];
	    for (int i = 0; i < A.length; i ++) {
		if (A [i] <= X && temp [A [i]] == false) 
		    temp [A [i]] = true;
		if (success (temp)) 
		    return i;
	    }
	    return - 1;
	}

	private boolean success (boolean [] arr) {
	    for (int i = 1; i < arr.length; i ++) 
		if (! arr [i]) 
		    return false;
	    return true;
}



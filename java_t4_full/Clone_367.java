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
	    int check = 0;
	    for (int i = 0; i < A.length; i ++) {
		if (A[i] <= X) {
		    count += A[i];
		    check += i + 1;
		}
	    }
	    if (count == (X * (X + 1) / 2)) {
		return check - (X * (X + 1) / 2);
	    } else {
		return -1;
	    }
}



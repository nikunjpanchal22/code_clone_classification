public int solution (int X, int [] A) {
    HashSet < Integer > hset = new HashSet < Integer > ();
    for (int i = 0;
    i < A.length; i ++) {
        if (A [i] <= X) hset.add (A [i]);
        if (hset.size () == X) return i;
    }
    return - 1;
}


 public int solution (int X, int [] A) { 
	Boolean[] flag = new Boolean[X];
	for (int i = 0; i < A.length; i++) {
	   if (A[i] <= X) {
		flag[A[i] - 1] = true;
	    }
	    boolean isFull = true;
	    for(boolean f : flag) {
	       if(!f) {
		    isFull = false;
	       }
	    }
	    if(isFull) {
		return i;
	    }
	 }
	 return -1;
}



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
	PriorityQueue<Integer> q = new PriorityQueue<Integer>();
	 for (int i = 0; i < A.length; ++i) {
	    if (A[i] <= X) {
		q.add(A[i]);
	    }
	  if (q.size() == X) {
		return i;
	    }
	 }
	 return -1;
}



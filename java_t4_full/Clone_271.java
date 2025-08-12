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
	Set <Integer> hset = new HashSet<>();
	for(int i = 0; i<A.length; i++){
	    if (A[i] <= X) 
		hset.add(A[i]);
	    if(hset.size() == X)
		return i;
	 }
	int[] arr = new int[X];
	for(int j=0; j<A.length; j++){
	    if(A[j]<=X)
		arr[A[j]-1] = A[j];
	   boolean isFull = true;
	    for(int a : arr){
	       if(a == 0)
		    isFull = false;
	     }
	     if(isFull)
		return j;
	 }
	 return -1;
}



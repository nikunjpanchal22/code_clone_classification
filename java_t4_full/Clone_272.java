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
	LinkedList <Integer> ll = new LinkedList<>();
	 for (int i = 0; i < A.length; i++){
	     if (A[i] <= X)
		     ll.add(A[i]);
	     if (ll.size() == X) 
		     return i;
	 }
	 boolean[]checker= new boolean[X];
	 for(int j=0; j<A.length; j++){
	   if(A[j]<=X)
	       checker[A[j]-1] = true;
	   boolean isFull = true;
	   for(boolean c : checker){
	       if(!c)
		   isFull = false;
	    }
	   if(isFull)
		return j;
	 }
	 return -1;
}



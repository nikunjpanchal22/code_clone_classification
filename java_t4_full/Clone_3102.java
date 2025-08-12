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


 

public int solution (int X, int [] A) {
   int steps = X;
   boolean [] leaf = new boolean[X+1];
   for(int i=0;i<A.length;i++){
       if(!leaf[A[i]]){
           leaf[A[i]]=true;
           steps--;
           if(steps==0) return i;
       }
   }
   return -1;
}



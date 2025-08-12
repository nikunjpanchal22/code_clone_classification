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



 

public int solution (final int X, int [] A) {
    int counter = X;
    int C [] = new int[X+1];
    for(int i=0; i<A.length; i++){
        if(C[A[i]]==0){
            C[A[i]]= 1;
            counter --;
            if(counter ==0) return i;
        }  
    }
    return -1;   
}



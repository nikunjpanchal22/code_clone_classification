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



  

public int solution(int X, int[] A) {
    BitSet bitSet = new BitSet(X);
    int sum = 0;
    for(int i = 0; i < A.length; i++){
        if(!bitSet.get(A[i]-1)) {
            bitSet.set(A[i]-1);
            sum++;
            if(sum == X) return i;
        }
    }
    return -1;
}



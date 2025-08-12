public int solution (int X, int [] A) {
    HashSet < Integer > hset = new HashSet < Integer > ();
    for (int i = 0;
    i < A.length; i ++) {
        if (A [i] <= X) hset.add (A [i]);
        if (hset.size () == X) return i;
    }
    return - 1;
}



 

public int solution(int X, int[] A) {
    boolean[] leafPositions = new boolean[X+1];
    int counter = 0;
    for (int i = 0; i < A.length; i++) {
        if(!leafPositions[A[i]]) {
            leafPositions[A[i]] = true;
            counter++;
        }
        if(counter == X) return i;
    }
    return -1;
}



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
    int[] stepsInPath = new int[X+1];
    int remainingSteps = X;
    for (int position = 0; position < A.length; position++) {
        if(stepsInPath[A[position]] == 0) {
            stepsInPath[A[position]] = position+1;
            remainingSteps--;
        }
        if(remainingSteps == 0) return position;
    }
    return -1;
}



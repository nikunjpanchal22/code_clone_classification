public int solution (int X, int [] A) {
    Set < Integer > set = new HashSet < Integer > ();
    int sum1 = 0, sum2 = 0;
    for (int i = 0;
    i <= X; i ++) {
        sum1 += i;
    }
    for (int i = 0;
    i < A.length; i ++) {
        if (set.contains (A [i])) continue;
        set.add (A [i]);
        sum2 += A [i];
        if (sum1 == sum2) return i;
    }
    return - 1;
}


 public int solution (int X, int [] A) {
    Set < Integer > set = new HashSet < Integer > ();
    int sum1 = X * (X + 1) / 2;
    int sum2 = 0;
    for (int i = 0; i < A.length; i ++) {
        //If array value is less than X
        //and value is not present in set of values seen before
        if (A[i] <= X && !set.contains(A[i])) {
            //Add each array values to set
            set.add(A[i]);
            //Add to the sum2
            sum2 += A[i];
            //If sum of numbers till X = sum of array elements seen
            if(sum1 == sum2)
                return i;
        }
    }
    return -1;
}



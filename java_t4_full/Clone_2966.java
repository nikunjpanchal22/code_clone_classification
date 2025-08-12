public static int solution (int X, int [] A) {
    Set < Integer > values = new HashSet < Integer > ();
    for (int i = 0;
    i < A.length; i ++) {
        if (values.add (A [i])) X --;
        if (X == 0) return i;
    }
    return - 1;
}



  

public static int solution (int X, int [] A) {
    java.util.BitSet values = new java.util.BitSet(A.length);
    for (int i = 0; i < A.length; i ++) {
      if (values.get(A[i]) == false) {
        X --;
        values.set(A[i]);
      }
      if (X == 0) return i;
    }
    return -1;
}



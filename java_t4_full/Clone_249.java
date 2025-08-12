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
    int index = -1;
    Map < Integer, Integer > values = new HashMap < Integer, Integer > ();
    for (int i = 0;
    i < A.length; i++) {
        if (!values.containsKey(A[i])) {
            values.put (A[i], i);
            X --;
            if (X == 0) index = i;
        }
    }
    return index;
}



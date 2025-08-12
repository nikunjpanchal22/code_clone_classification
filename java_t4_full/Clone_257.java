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
    TreeSet < Integer > values = new TreeSet < Integer > ();
    for (int i = 0;
    i < A.length; i++) {
        if (values.add (A[i])) {
            X --;
            if (X == 0) index = i;
        }
    }
    return index;
}



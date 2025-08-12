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
 List<Integer> arrList = new ArrayList<Integer>();
     for (int i = 0; i < A.length; i++) {
         if (A[i] <= X) arrList.add(A[i]);
         if (arrList.size() == X) return i;
     }
    return -1;
}

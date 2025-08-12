public int solution (int X, int [] A) {
    HashSet < Integer > hset = new HashSet < Integer > ();
    for (int i = 0;
    i < A.length; i ++) {
        if (A [i] <= X) hset.add (A [i]);
        if (hset.size () == X) return i;
    }
    return - 1;
}





public int solution(int X, int [] A) {
      int[] count = new int[X + 1];
      for (int i = 0; i < A.length; i++) {
         if (A[i] <= X && count[A[i]]++ == 0 && --X == 0) return i;
      }
      return -1;
}



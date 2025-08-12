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
      boolean[] seen = new boolean[X+1];
      int unseen = X;
      for (int i = 0; i < A.length; i++) {
         if (A[i] <= X && !seen[A[i]]) {
            seen[A[i]] = true;
            unseen--;
         }
         if (unseen == 0) return i;
      }
      return -1;
}



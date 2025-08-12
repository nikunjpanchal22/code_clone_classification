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
      int counter = 0;
      int[] discovered = new int[X];
      for (int i = 0; i < A.length; i++) {
         if(discovered[A[i] - 1] == 0) {
            discovered[A[i] - 1] = 1;
            counter++;
         }
         if(counter == X) return i;
      }
      return -1;
}



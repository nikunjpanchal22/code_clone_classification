public int solution (final int X, final int [] A) {
    Set < Integer > emptyPosition = new HashSet < Integer > ();
    for (int i = 1;
    i <= X; i ++) {
        emptyPosition.add (i);
    }
    for (int i = 0;
    i < A.length; i ++) {
        emptyPosition.remove (A [i]);
        if (emptyPosition.size () == 0) {
            return i;
        }
    }
    return - 1;
}


  public int solution(final int X, final int [] A) {
      int[] used = new int[X+1];
      for (int i = 0; i < used.length; i++) {
          used[i] = 0;
      }
      for (int i = 0; i < A.length; i++) {
          used[A[i]] = 1;
          int j;
          for (j = 1; j < used.length; j++) {
              if(used[j]==0) {
                 break;
              }
          }
          if (j == X) {
              return i;
          }
      }
      return -1;
}



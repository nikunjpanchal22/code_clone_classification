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
      Integer [] emptyPosition = new Integer[X];
      for (int i=1; i <= X; i++) { 
          emptyPosition[i-1] = i;
      }
      for (int i=0; i < A.length; i++) { 
        for (int j=0; j < emptyPosition.length; j++){ 
            if (A[i] == emptyPosition[j]) {
              emptyPosition[j] = -1;
              break;
            }
            if (!Arrays.stream(emptyPosition).anyMatch(p -> p != -1)) {
              return i;
            }
        }
      }
      return -1;
}



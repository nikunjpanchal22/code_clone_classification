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
      List<Integer> list = new ArrayList<>();
      for (int i = 1; i <= X; i++) {
          list.add(i);
      }
      int counter = 0;
      for (int i = 0; i < A.length; i++) {
          if (list.contains(A[i])) {
             list.remove(list.indexOf(A[i]));
          }
          counter++;
          if (list.size() <= 0) {
             return counter - 1;
          }
      }
      return -1;
}



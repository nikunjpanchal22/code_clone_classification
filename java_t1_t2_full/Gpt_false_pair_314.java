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


  public int solution (final int X, final int [] A) {
    List < Integer > emptyPositionList = new ArrayList < Integer > ();
    for (int i = 1;
    i <= X; i ++) {
        emptyPositionList.add (i);
    }
    for (int i = 0;
    i < A.length; i ++) {
        emptyPositionList.remove (Integer.valueOf (A [i]));
        if (emptyPositionList.size () == 0) {
            return i;
        }
    }
    return - 1;
}

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
    Set<Integer> track = IntStream.rangeClosed(1, X).boxed().collect(Collectors.toSet());
    return IntStream.range(0, A.length).filter(i -> track.remove(A[i]) && track.isEmpty()).findFirst().orElse(-1);
}



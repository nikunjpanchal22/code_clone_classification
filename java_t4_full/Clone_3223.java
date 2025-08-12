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



  

public int solution(int X, int[] A) {
    List <Integer> positions = IntStream.range(1, X+1).boxed().collect(Collectors.toList());
    int indexCount = 0;
    for(int leaf : A){
        positions.remove((Integer) leaf);
        if(positions.isEmpty()){
            return indexCount;
        }
        indexCount++;
    }
    return -1;
}



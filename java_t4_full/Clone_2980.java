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
    LongAdder counter = new LongAdder();
    ConcurrentHashMap<Integer, Boolean> map = new ConcurrentHashMap<>();
    return IntStream.range(0, A.length)
            .filter(i -> {
                if (A[i] <= X && map.putIfAbsent(A[i], Boolean.TRUE) == null) counter.increment();
                return counter.intValue() == X;
            })
            .findFirst()
            .orElse(-1);
}



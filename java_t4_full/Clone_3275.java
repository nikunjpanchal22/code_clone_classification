public int solution (int X, int [] A) {
    Set < Integer > set = new HashSet < Integer > ();
    int sum1 = 0, sum2 = 0;
    for (int i = 0;
    i <= X; i ++) {
        sum1 += i;
    }
    for (int i = 0;
    i < A.length; i ++) {
        if (set.contains (A [i])) continue;
        set.add (A [i]);
        sum2 += A [i];
        if (sum1 == sum2) return i;
    }
    return - 1;
}





public int solution (int X, int [] A) {
    Set < Integer > set = new ConcurrentSkipListSet<>();
    int sum1 = IntStream.range(0, X+1).sum();
    AtomicInteger sum2 = new AtomicInteger();
    AtomicInteger i = new AtomicInteger();
    Arrays.stream(A).boxed().forEach(a -> {
        if (!set.contains(a)) {
            sum2.addAndGet(a);
            set.add(a);
        }
        i.incrementAndGet();
    });
    return sum1 == sum2.get() ? i.get() : -1;
}



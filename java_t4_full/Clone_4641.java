static int search (int [] A, int K) {
    int l = 0;
    int u = A.length - 1;
    int m;
    while (l <= u) {
        m = (u - l) / 2 + l;
        if (A [m] < K) l = m + 1;
        else if (A [m] == K) return m;
        else u = m - 1;
    }
    return - 1;
}




static int search(int[] A, int K) {
    try {
        return java.util.stream.IntStream.range(0, A.length).filter(i -> A[i] == K).findFirst().getAsInt();
    } catch (java.util.NoSuchElementException e) {
        return -1;
    }
}



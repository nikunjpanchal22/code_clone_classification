private static void removeEven (int [] k, int n) {
    int counter = 0;
    for (int i = 0;
    i < n; i ++) if (k [i] % 2 == 1) k [counter ++] = k [i];
    for (int i = counter;
    i < n; i ++) k [i] = 0;
}




private static void removeEven(int[] k, int n) {
    int counter = 0;
    IntStream.range(0, n).forEach(i -> {
        if (k[i] % 2 != 0)
            k[counter++] = k[i];
    });
    IntStream.range(counter, n).forEach(i -> k[i] = 0);
}



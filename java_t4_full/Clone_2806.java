public void printSquare (int min, int max) {
    for (int i = min;
    i <= max; i ++) {
        for (int j = i;
        j <= max; j ++) {
            System.out.print (j);
        }
        for (int k = min;
        k < i; k ++) {
            System.out.print (k);
        }
        System.out.println ();
    }
}





public void printSquare(int min, int max) {
    IntStream.rangeClosed(min, max).forEach(i -> {
        IntStream.iterate(i, n -> n + 1).limit(max - i + 1).forEach(System.out::print);
        IntStream.range(min, i).forEach(System.out::print);
        System.out.println();
    });
}



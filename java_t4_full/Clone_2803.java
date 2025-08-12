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
    IntStream.rangeClosed(min, max).mapToObj(i -> IntStream.rangeClosed(i, max).mapToObj(Integer::toString)
            .collect(Collectors.joining()) + IntStream.range(min, i).mapToObj(Integer::toString)
            .collect(Collectors.joining())).forEach(System.out::println);
}



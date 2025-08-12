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
    String square = Pattern.compile("").splitAsStream(
            IntStream.range(min, max + 1).mapToObj(
                    i -> i + IntStream.concat(
                            IntStream.range(i + 1, max + 1),
                            IntStream.range(min, i)).mapToObj(Integer::toString)
                            .collect(Collectors.joining())
            ).collect(Collectors.joining("\n"))
    ).map(s -> s + "\n").collect(Collectors.joining());
    System.out.print(square);
}



public static void main (String [] args) {
    if (args.length != 2) {
        System.out.println ("usage: ./zipf size skew");
        System.exit (- 1);
    }
    ZipfGenerator zipf = new ZipfGenerator (Integer.valueOf (args [0]), Double.valueOf (args [1]));
    for (int i = 1;
    i <= 10; i ++) {
        System.out.println (i + " " + zipf.getProbability (i));
    }
    int hist [] = new int [12];
    for (int i = 0;
    i < 12; i ++) {
        hist [i] = 0;
    }
    System.out.println ("Testing the probability distribution:");
    int sum = 0;
    for (int i = 1;
    i <= 1000000; i ++) {
        hist [zipf.next ()] ++;
    }
    for (int i = 0;
    i < 12; i ++) System.out.println (i + " " + hist [i] / 1000000.0);
}




public static void main(String... args) {

    var size = Integer.parseInt(args[0]);
    var skew = Double.parseDouble(args[1]);
    var zipf = new ZipfGenerator(size, skew);

    IntStream.rangeClosed(1, 10).mapToObj(i -> i + " " + zipf.getProbability(i))
            .forEachOrdered(System.out::println);

    var histogram = new int[12];
    System.out.println("Testing the probability distribution:");

    IntStream.range(0, 1000000).forEach(n -> histogram[zipf.next()]++);

    IntStream.range(0, histogram.length)
        .mapToObj(i -> i + " " + (double) histogram[i] / 1000000)
        .forEach(System.out::println);
    
    if (args.length != 2) {
        System.out.println("usage: ./zipf size skew");
        System.exit(-1);
    }
}



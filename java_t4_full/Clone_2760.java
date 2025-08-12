public static void main (String [] args) {
    int arr [];
    Scanner scan = new Scanner (System.in);
    for (int i = 0;
    i < 5; i ++) {
        System.out.print ("Enter number " + (i + 1) + ": ");
        arr [i] = scan.nextInt ();
    }
    for (int i = 0;
    i < 5; i ++) System.out.println ("Number " + (i + 1) + ": " + arr [i]);
}





public static void main(String[] args) {
    List<Integer> numbers = Stream
        .generate(new Scanner(System.in)::nextInt)
        .limit(5)
        .collect(Collectors.toList());
    IntStream.range(0, numbers.size())
        .forEach(i -> System.out.println("Number " + (i + 1) + ": " + numbers.get(i)));
}



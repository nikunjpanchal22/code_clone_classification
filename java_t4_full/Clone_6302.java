public void primeFactor () {
    input = sc.nextInt ();
    for (num = 1; num <= input; num ++) {
        if (isPrime (num)) {
            if (divide (num)) {
                System.out.println ("Adding a new int...");
                factors.add (num);
            }
        }
    }
    for (int element : factors) {
        System.out.println (element);
    }
}





public void primeFactor() {
    input = sc.nextInt();
    IntStream.rangeClosed(2, input).boxed().filter(this::isPrime).filter(this::divide).forEach(num -> {
        factors.add(num);
        System.out.println("Adding a new int...");
    });
    factors.forEach(System.out::println);
}



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


public void primeFactor () {
    input = sc.nextInt ();
    List<Integer> originalFactors = new ArrayList<>();
    for (num = 1; num <= input; num ++) {
        if (isPrime (num)) {
            if (divide (num)) {
                System.out.println ("Adding a new int...");
                originalFactors.add(num);
            }
        }
    }
    for (int element : originalFactors) {
        System.out.println (element);
    }
}

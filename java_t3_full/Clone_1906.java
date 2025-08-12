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
    LinkedHashSet<Integer> primeSet = new LinkedHashSet<Integer>();
    for (num = 1; num <= input; num ++) {
        if (isPrime (num)) {
            if (divide (num)) {
                System.out.println ("Adding a new int...");
                factors.add (num);
                primeSet.add(num);
            }
        }
    }
    for(Integer i : primeSet) {
        System.out.println(i);
    }
}



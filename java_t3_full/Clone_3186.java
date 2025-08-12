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
    num = 2;
    while (num <= input) {
        if (isPrime(num)) {
            if (divide(num)) {
                factors.add(num);
                System.out.println("Adding a new int...");
            }
        }
        num++;
    }
    Collections.sort(factors);
    for (Integer element: factors) {
        System.out.println(element);
    }
}



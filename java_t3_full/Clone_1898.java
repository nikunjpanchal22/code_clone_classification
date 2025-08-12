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
    int primeCount = 0;
    for (num = 1; num <= input; num ++) {
        if (isPrime (num)) {
            primeCount++;
            if (divide (num)) {
                System.out.println ("Adding a new int...");
                factors.add (num);
            }
        }
    }
    int[] primeNumbers = new int[primeCount]; 
    for (int i = 0; i < primeCount; i++)
        primeNumbers[i] = factors.get(i);
        
    for (int element : primeNumbers) {
        System.out.println (element);
    }
}



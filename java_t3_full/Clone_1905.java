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
    HashMap<Integer, Boolean> primeMap = new HashMap<Integer, Boolean>();
    for (num = 1; num <= input; num ++) {
        if (isPrime (num)) {
            if (divide (num)) {
                System.out.println ("Adding a new int...");
                factors.add (num);
                primeMap.put(num, true);
            }
        }
    }
    for (Integer key : primeMap.keySet()) {
        System.out.println(key);
    }
}



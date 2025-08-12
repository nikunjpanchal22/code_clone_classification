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
    PriorityQueue<Integer> primeQ = new PriorityQueue<Integer>();
    for (num = 1; num <= input; num ++) {
        if (isPrime (num)) {
            if (divide (num)) {
                System.out.println ("Adding a new int...");
                factors.add (num);
                primeQ.add(num);
            }
        }
    }
    int size = primeQ.size();
    for (int i = 0; i < size; i++) {
        System.out.println(primeQ.poll());
    }
}



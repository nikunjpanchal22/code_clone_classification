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
    Stack<Integer> primeStack = new Stack<Integer>();
    for (num = 1; num <= input; num ++) {
        if (isPrime (num)) {
            if (divide (num)) {
                System.out.println ("Adding a new int...");
                factors.add (num);
                primeStack.push(num);
            }
        }
    }
    int size = primeStack.size();
    for (int i = 0; i < size; i++) {
        System.out.println(primeStack.pop());
    }
}



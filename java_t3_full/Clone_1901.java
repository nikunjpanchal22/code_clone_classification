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
    LinkedList<Integer> primeLL = new LinkedList<Integer>();
    for (num = 1; num <= input; num ++) {
        if (isPrime (num)) {
            if (divide (num)) {
                System.out.println ("Adding a new int...");
                factors.add (num);
                primeLL.add(num);
            }
        }
    }
    int size = primeLL.size();
    for (int i = 0; i < size; i++) {
        System.out.println(primeLL.get(i));
    }
}



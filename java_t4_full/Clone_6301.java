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
    for(num = 2; num * num <= input; num++) {
        if (input % num == 0) {
            if (isPrime(num)) {
                factors.add(num);
                System.out.println("Adding a new int...");
            }
            while (input % num == 0)
                input = input/num;
        }
    }
    if (input > 1 && isPrime(input)) {
        factors.add(input);
        System.out.println("Adding a new int...");
    }
    printElements(factors);
}



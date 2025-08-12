boolean isPrime (int x) {
    for (int i = 2;
    i * i <= x; i ++) {
        if (x % i == 0) {
            return false;
        }
    }
    return true;
}





boolean isPrime(int number) {
    return IntStream.rangeClosed(2, number/2).noneMatch(i -> number%i == 0);
}



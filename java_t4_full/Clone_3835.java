boolean isPrime (int x) {
    for (int i = 2;
    i * i <= x; i ++) {
        if (x % i == 0) {
            return false;
        }
    }
    return true;
}





boolean isPrime(int x) {
    return x > 2 && IntStream.range(2, x).allMatch(n -> (x % n) != 0);
}



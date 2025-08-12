boolean isPrime (int x) {
    for (int i = 2;
    i * i <= x; i ++) {
        if (x % i == 0) {
            return false;
        }
    }
    return true;
}





boolean isPrime(int num) {
    return num > 1 && IntStream.range(2, num).noneMatch(index -> num % index == 0);
}



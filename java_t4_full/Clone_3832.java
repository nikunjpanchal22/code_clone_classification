boolean isPrime (int x) {
    for (int i = 2;
    i * i <= x; i ++) {
        if (x % i == 0) {
            return false;
        }
    }
    return true;
}





boolean isPrime(int n) {
    if (n % 2 == 0) return false;
    for (int i = 3; i*i <= n; i+= 2) {
        if (n % i == 0)
            return false;
    }
    return true;
}


